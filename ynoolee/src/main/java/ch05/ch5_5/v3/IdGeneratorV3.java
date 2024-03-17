package ch05.ch5_5.v3;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

public interface IdGeneratorV3 {

    String generate();
}


