package org.bouncycastle.jcajce.provider.config;

import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

public interface ProvConf {

    Map getAdditionalECParameters();

    DHParameterSpec getDHDefaultParameters(int arg0);

    Set getAcceptableNamedCurves();

    ECParameterSpec getEcImplicitlyCa();
}
