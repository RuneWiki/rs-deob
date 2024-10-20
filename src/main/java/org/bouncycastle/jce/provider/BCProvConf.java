package org.bouncycastle.jce.provider;

import java.security.Permission;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProvConf;
import org.bouncycastle.jcajce.provider.config.ProvConfPermission;
import org.bouncycastle.jce.spec.ECParameterSpec;

public class BCProvConf implements ProvConf {

    public ThreadLocal ecThreadSpec = new ThreadLocal();

    public ThreadLocal dhThreadSpec = new ThreadLocal();

    public volatile Set acceptableNamedCurves = new HashSet();

    public volatile Map additionalECParameters = new HashMap();

    public static Permission BC_EC_LOCAL_PERMISSION = new ProvConfPermission("BC", "threadLocalEcImplicitlyCa");

    public static Permission BC_EC_PERMISSION = new ProvConfPermission("BC", "ecImplicitlyCa");

    public static Permission BC_DH_LOCAL_PERMISSION = new ProvConfPermission("BC", "threadLocalDhDefaultParams");

    public static Permission BC_DH_PERMISSION = new ProvConfPermission("BC", "DhDefaultParams");

    public static Permission BC_EC_CURVE_PERMISSION = new ProvConfPermission("BC", "acceptableEcCurves");

    public static Permission BC_ADDITIONAL_EC_CURVE_PERMISSION = new ProvConfPermission("BC", "additionalEcParameters");

    public volatile Object dhDefaultParams;

    public volatile ECParameterSpec ecImplicitCaParams;

    public ECParameterSpec getEcImplicitlyCa() {
        ECParameterSpec var1 = (ECParameterSpec) this.ecThreadSpec.get();
        return var1 == null ? this.ecImplicitCaParams : var1;
    }

    public DHParameterSpec getDHDefaultParameters(int arg0) {
        Object var2 = this.dhThreadSpec.get();
        if (var2 == null) {
            var2 = this.dhDefaultParams;
        }
        if (var2 instanceof DHParameterSpec) {
            DHParameterSpec var3 = (DHParameterSpec) var2;
            if (var3.getP().bitLength() == arg0) {
                return var3;
            }
        } else if (var2 instanceof DHParameterSpec[]) {
            DHParameterSpec[] var4 = (DHParameterSpec[]) ((DHParameterSpec[]) var2);
            for (int var5 = 0; var5 != var4.length; var5++) {
                if (var4[var5].getP().bitLength() == arg0) {
                    return var4[var5];
                }
            }
        }
        return null;
    }

    public Set getAcceptableNamedCurves() {
        return Collections.unmodifiableSet(this.acceptableNamedCurves);
    }

    public Map getAdditionalECParameters() {
        return Collections.unmodifiableMap(this.additionalECParameters);
    }

    public void setParameter(String arg0, Object arg1) {
        SecurityManager var3 = System.getSecurityManager();
        if (arg0.equals("threadLocalEcImplicitlyCa")) {
            if (var3 != null) {
                var3.checkPermission(BC_EC_LOCAL_PERMISSION);
            }
            ECParameterSpec var4;
            if ((arg1 instanceof ECParameterSpec) || arg1 == null) {
                var4 = (ECParameterSpec) arg1;
            } else {
                var4 = EC5Util.convertSpec((java.security.spec.ECParameterSpec) arg1, false);
            }
            if (var4 == null) {
                this.ecThreadSpec.remove();
            } else {
                this.ecThreadSpec.set(var4);
            }
        } else if (arg0.equals("ecImplicitlyCa")) {
            if (var3 != null) {
                var3.checkPermission(BC_EC_PERMISSION);
            }
            if ((arg1 instanceof ECParameterSpec) || arg1 == null) {
                this.ecImplicitCaParams = (ECParameterSpec) arg1;
            } else {
                this.ecImplicitCaParams = EC5Util.convertSpec((java.security.spec.ECParameterSpec) arg1, false);
            }
        } else if (arg0.equals("threadLocalDhDefaultParams")) {
            if (var3 != null) {
                var3.checkPermission(BC_DH_LOCAL_PERMISSION);
            }
            if (!(arg1 instanceof DHParameterSpec) && !(arg1 instanceof DHParameterSpec[]) && arg1 != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
            if (arg1 == null) {
                this.dhThreadSpec.remove();
            } else {
                this.dhThreadSpec.set(arg1);
            }
        } else if (arg0.equals("DhDefaultParams")) {
            if (var3 != null) {
                var3.checkPermission(BC_DH_PERMISSION);
            }
            if (!(arg1 instanceof DHParameterSpec) && !(arg1 instanceof DHParameterSpec[]) && arg1 != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
            }
            this.dhDefaultParams = arg1;
        } else if (arg0.equals("acceptableEcCurves")) {
            if (var3 != null) {
                var3.checkPermission(BC_EC_CURVE_PERMISSION);
            }
            this.acceptableNamedCurves = (Set) arg1;
        } else if (arg0.equals("additionalEcParameters")) {
            if (var3 != null) {
                var3.checkPermission(BC_ADDITIONAL_EC_CURVE_PERMISSION);
            }
            this.additionalECParameters = (Map) arg1;
        }
    }
}
