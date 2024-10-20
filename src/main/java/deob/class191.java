package deob;

@ObfuscatedName("ha")
public class class191 extends class470 {

    @ObfuscatedName("ha.ar")
    public static class289 field1956 = new class289(64);

    @ObfuscatedName("ha.am")
    public static class289 field1967 = new class289(64);

    @ObfuscatedName("ha.as")
    public int field1963;

    @ObfuscatedName("ha.az")
    public int field1960 = 255;

    @ObfuscatedName("ha.av")
    public int field1961 = 255;

    @ObfuscatedName("ha.ap")
    public int field1965 = -1;

    @ObfuscatedName("ha.aq")
    public int field1954 = 1;

    @ObfuscatedName("ha.at")
    public int field1962 = 70;

    @ObfuscatedName("ha.ah")
    public int field1957 = -1;

    @ObfuscatedName("ha.ax")
    public int field1966 = -1;

    @ObfuscatedName("ha.aa")
    public int field1964 = 30;

    @ObfuscatedName("ha.au")
    public int field1968 = 0;

    @ObfuscatedName("ha.aw(Lty;I)V")
    public void method3341(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3352(arg0, var2);
        }
    }

    @ObfuscatedName("ha.ay(Lty;II)V")
    public void method3352(class514 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8246();
        } else if (arg1 == 2) {
            this.field1960 = arg0.method8244();
        } else if (arg1 == 3) {
            this.field1961 = arg0.method8244();
        } else if (arg1 == 4) {
            this.field1965 = 0;
        } else if (arg1 == 5) {
            this.field1962 = arg0.method8246();
        } else if (arg1 == 6) {
            arg0.method8244();
        } else if (arg1 == 7) {
            this.field1957 = arg0.method8310();
        } else if (arg1 == 8) {
            this.field1966 = arg0.method8310();
        } else if (arg1 == 11) {
            this.field1965 = arg0.method8246();
        } else if (arg1 == 14) {
            this.field1964 = arg0.method8244();
        } else if (arg1 == 15) {
            this.field1968 = arg0.method8244();
        }
    }

    @ObfuscatedName("ha.ar(S)Lud;")
    public class528 method3354() {
        if (this.field1957 < 0) {
            return null;
        }
        class528 var1 = (class528) field1967.method5152((long) this.field1957);
        if (var1 != null) {
            return var1;
        }
        class528 var2 = class529.method7931(Statics.field1955, this.field1957, 0);
        if (var2 != null) {
            field1967.method5149(var2, (long) this.field1957);
        }
        return var2;
    }

    @ObfuscatedName("ha.am(B)Lud;")
    public class528 method3349() {
        if (this.field1966 < 0) {
            return null;
        }
        class528 var1 = (class528) field1967.method5152((long) this.field1966);
        if (var1 != null) {
            return var1;
        }
        class528 var2 = class529.method7931(Statics.field1955, this.field1966, 0);
        if (var2 != null) {
            field1967.method5149(var2, (long) this.field1966);
        }
        return var2;
    }

    @ObfuscatedName("tm.as(I)V")
    public static void method8118() {
        field1956.method5146();
        field1967.method5146();
    }
}
