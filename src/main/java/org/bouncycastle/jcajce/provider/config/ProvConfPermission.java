package org.bouncycastle.jcajce.provider.config;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import org.bouncycastle.util.Strings;

public class ProvConfPermission extends BasicPermission {

    public final String actions;

    public final int permissionMask;

    public static final int ACCEPTABLE_EC_CURVES = 16;

    public static final int ADDITIONAL_EC_PARAMETERS = 32;

    public static final int ALL = 63;

    public static final int DH_DEFAULT_PARAMS = 8;

    public static final int EC_IMPLICITLY_CA = 2;

    public static final int THREAD_LOCAL_DH_DEFAULT_PARAMS = 4;

    public static final int THREAD_LOCAL_EC_IMPLICITLY_CA = 1;

    public static final String ACCEPTABLE_EC_CURVES_STR = "acceptableeccurves";

    public static final String ADDITIONAL_EC_PARAMETERS_STR = "additionalecparameters";

    public static final String ALL_STR = "all";

    public static final String DH_DEFAULT_PARAMS_STR = "dhdefaultparams";

    public static final String EC_IMPLICITLY_CA_STR = "ecimplicitlyca";

    public static final String THREAD_LOCAL_DH_DEFAULT_PARAMS_STR = "threadlocaldhdefaultparams";

    public static final String THREAD_LOCAL_EC_IMPLICITLY_CA_STR = "threadlocalecimplicitlyca";

    public boolean af(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ProvConfPermission)) {
            ProvConfPermission var2 = (ProvConfPermission) arg0;
            return this.permissionMask == var2.permissionMask && this.getName().equals(var2.getName());
        } else {
            return false;
        }
    }

    public ProvConfPermission(String arg0, String arg1) {
        super(arg0, arg1);
        this.actions = arg1;
        this.permissionMask = this.calculateMask(arg1);
    }

    public int calculateMask(String arg0) {
        StringTokenizer var2 = new StringTokenizer(Strings.toLowerCase(arg0), " ,");
        int var3 = 0;
        while (var2.hasMoreTokens()) {
            String var4 = var2.nextToken();
            if (var4.equals("threadlocalecimplicitlyca")) {
                var3 |= 0x1;
            } else if (var4.equals("ecimplicitlyca")) {
                var3 |= 0x2;
            } else if (var4.equals("threadlocaldhdefaultparams")) {
                var3 |= 0x4;
            } else if (var4.equals("dhdefaultparams")) {
                var3 |= 0x8;
            } else if (var4.equals("acceptableeccurves")) {
                var3 |= 0x10;
            } else if (var4.equals("additionalecparameters")) {
                var3 |= 0x20;
            } else if (var4.equals("all")) {
                var3 |= 0x3F;
            }
        }
        if (var3 == 0) {
            throw new IllegalArgumentException("unknown permissions passed to mask");
        }
        return var3;
    }

    public boolean implies(Permission arg0) {
        if (!(arg0 instanceof ProvConfPermission)) {
            return false;
        } else if (this.getName().equals(arg0.getName())) {
            ProvConfPermission var2 = (ProvConfPermission) arg0;
            return (this.permissionMask & var2.permissionMask) == var2.permissionMask;
        } else {
            return false;
        }
    }

    public int acz() {
        return this.getName().hashCode() + this.permissionMask;
    }

    public String getActions() {
        return this.actions;
    }

    public int hashCode() {
        return this.getName().hashCode() + this.permissionMask;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ProvConfPermission)) {
            ProvConfPermission var2 = (ProvConfPermission) arg0;
            return this.permissionMask == var2.permissionMask && this.getName().equals(var2.getName());
        } else {
            return false;
        }
    }

    public boolean bz(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ProvConfPermission)) {
            ProvConfPermission var2 = (ProvConfPermission) arg0;
            return this.permissionMask == var2.permissionMask && this.getName().equals(var2.getName());
        } else {
            return false;
        }
    }

    public boolean bt(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ProvConfPermission)) {
            ProvConfPermission var2 = (ProvConfPermission) arg0;
            return this.permissionMask == var2.permissionMask && this.getName().equals(var2.getName());
        } else {
            return false;
        }
    }

    public int ace() {
        return this.getName().hashCode() + this.permissionMask;
    }

    public ProvConfPermission(String arg0) {
        super(arg0);
        this.actions = "all";
        this.permissionMask = 63;
    }
}
