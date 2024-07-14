package ch06;

public class ConstructorArg {
    private boolean isRef;
    private Class type;
    private Object arg;

    private ConstructorArg(final boolean isRef, final Class type, final Object arg) {
        this.isRef = isRef;
        this.type = type;
        this.arg = arg;
    }

    private class ConstructorArgBuilder {

        private boolean isRef;
        private Class type;
        private Object arg;

        public ConstructorArgBuilder(final boolean isRef, final Class type, final Object arg) {
            this.isRef = isRef;
            this.type = type;
            this.arg = arg;
        }

        public ConstructorArgBuilder isRef(boolean yN) {
            this.isRef = yN;
            return this;
        }

        public ConstructorArgBuilder type(Class type) {
            this.type = type;
            return this;
        }

        public ConstructorArgBuilder arg(Object arg) {
            this.arg = arg;
            return this;
        }

        public ConstructorArg build() {
            if(isRef) {
                if(arg != null) {
                    throw new IllegalArgumentException("isRef 가 true 면 arg 는 null 이어야 합니다");
                }
            }

            if(arg == null || type == null) {
                throw new IllegalArgumentException("isRef 가 false 면 arg 와 type 은 null 이 올 수 없습니다");
            }

            return new ConstructorArg(this.isRef, this.type, this.arg);
        }
    }
}

