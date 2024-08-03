package ch08.handler.sensitivewordfilter.gof;

public class Application {
    public static void main(String[] args) {
        final SensitiveWordFilterChain chain = new SensitiveWordFilterChain();
        chain.addFilter(new ViolenceFilter());
        chain.addFilter(new SexualWordFilter());

        boolean legal = chain.filter(new Content());
        if (!legal) {
            //
        } else {
            //
        }
    }
}
