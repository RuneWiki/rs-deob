package deob;

@ObfuscatedName("ik")
public class class218 extends class489 {

    @ObfuscatedName("ik.ah")
    public static class304 field2211 = new class304(64);

    @ObfuscatedName("ik.af")
    public char field2212;

    @ObfuscatedName("ik.at")
    public int field2210;

    @ObfuscatedName("ik.an")
    public String field2214;

    @ObfuscatedName("ik.ao")
    public boolean field2215 = true;

    @ObfuscatedName("lj.az(Loc;B)V")
    public static void method5210(class379 arg0) {
        Statics.field2216 = arg0;
    }

    @ObfuscatedName("ev.ah(II)Lik;")
    public static class218 method2822(int arg0) {
        class218 var1 = (class218) field2211.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2216.method6328(11, arg0);
        class218 var3 = new class218();
        if (var2 != null) {
            var3.method3677(new class535(var2));
        }
        var3.method3674();
        field2211.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.af(I)V")
    public void method3674() {
    }

    @ObfuscatedName("ik.at(Lur;I)V")
    public void method3677(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3676(arg0, var2);
        }
    }

    @ObfuscatedName("ik.an(Lur;IB)V")
    public void method3676(class535 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method8463();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class405.field4560[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field2212 = var6;
        } else if (arg1 == 2) {
            this.field2210 = arg0.method8682();
        } else if (arg1 == 4) {
            this.field2215 = false;
        } else if (arg1 == 5) {
            this.field2214 = arg0.method8473();
        }
    }

    @ObfuscatedName("ik.ao(B)Z")
    public boolean method3687() {
        return this.field2212 == 's';
    }

    @ObfuscatedName("ar.ab(I)V")
    public static void method179() {
        field2211.method5339();
    }
}
