package org.bouncycastle.jcajce.provider.config;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.util.AsymKeyInfoConverter;

public interface ConfProvider {

    String ACCEPTABLE_EC_CURVES = "acceptableEcCurves";

    String ADDITIONAL_EC_PARAMETERS = "additionalEcParameters";

    String DH_DEFAULT_PARAMS = "DhDefaultParams";

    String EC_IMPLICITLY_CA = "ecImplicitlyCa";

    String THREAD_LOCAL_DH_DEFAULT_PARAMS = "threadLocalDhDefaultParams";

    String THREAD_LOCAL_EC_IMPLICITLY_CA = "threadLocalEcImplicitlyCa";

    void addKeyInfoConverter(ASN1ObjectIdentifier arg0, AsymKeyInfoConverter arg1);

    void setParameter(String arg0, Object arg1);

    void addAlgorithm(String arg0, ASN1ObjectIdentifier arg1, String arg2);

    boolean hasAlgorithm(String arg0, String arg1);

    void addAlgorithm(String arg0, String arg1);
}
