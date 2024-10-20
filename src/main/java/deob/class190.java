package deob;

@ObfuscatedName("hp")
public class class190 extends class457 {

    @ObfuscatedName("hp.av")
    public static class287 field1954 = new class287(64);

    @ObfuscatedName("hp.as")
    public static class287 field1952 = new class287(64);

    @ObfuscatedName("hp.ax")
    public int field1955;

    @ObfuscatedName("hp.ak")
    public int field1967 = 255;

    @ObfuscatedName("hp.ae")
    public int field1959 = 255;

    @ObfuscatedName("hp.af")
    public int field1960 = -1;

    @ObfuscatedName("hp.ao")
    public int field1961 = 1;

    @ObfuscatedName("hp.aa")
    public int field1965 = 70;

    @ObfuscatedName("hp.aj")
    public int field1963 = -1;

    @ObfuscatedName("hp.ad")
    public int field1964 = -1;

    @ObfuscatedName("hp.ac")
    public int field1962 = 30;

    @ObfuscatedName("hp.ag")
    public int field1966 = 0;

    @ObfuscatedName("hp.at(Ltz;I)V")
    public void method3328(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3330(arg0, var2);
        }
    }

    @ObfuscatedName("hp.an(Ltz;II)V")
    public void method3330(class501 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method8195();
        } else if (arg1 == 2) {
            this.field1967 = arg0.method8129();
        } else if (arg1 == 3) {
            this.field1959 = arg0.method8129();
        } else if (arg1 == 4) {
            this.field1960 = 0;
        } else if (arg1 == 5) {
            this.field1965 = arg0.method8195();
        } else if (arg1 == 6) {
            arg0.method8129();
        } else if (arg1 == 7) {
            this.field1963 = arg0.method8148();
        } else if (arg1 == 8) {
            this.field1964 = arg0.method8148();
        } else if (arg1 == 11) {
            this.field1960 = arg0.method8195();
        } else if (arg1 == 14) {
            this.field1962 = arg0.method8129();
        } else if (arg1 == 15) {
            this.field1966 = arg0.method8129();
        }
    }

    @ObfuscatedName("hp.av(I)Ltm;")
    public class515 method3331() {
        if (this.field1963 < 0) {
            return null;
        }
        class515 var1 = (class515) field1952.method5121((long) this.field1963);
        if (var1 != null) {
            return var1;
        }
        class515 var2 = class516.method2561(Statics.field1953, this.field1963, 0);
        if (var2 != null) {
            field1952.method5123(var2, (long) this.field1963);
        }
        return var2;
    }

    @ObfuscatedName("hp.as(I)Ltm;")
    public class515 method3332() {
        if (this.field1964 < 0) {
            return null;
        }
        class515 var1 = (class515) field1952.method5121((long) this.field1964);
        if (var1 != null) {
            return var1;
        }
        class515 var2 = class516.method2561(Statics.field1953, this.field1964, 0);
        if (var2 != null) {
            field1952.method5123(var2, (long) this.field1964);
        }
        return var2;
    }

    @ObfuscatedName("hn.ax(I)V")
    public static void method3269() {
        field1954.method5124();
        field1952.method5124();
    }
}
