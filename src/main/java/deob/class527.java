package deob;

@ObfuscatedName("uf")
public class class527 extends class488 {

    @ObfuscatedName("uf.aw")
    public static class304 field5149 = new class304(64);

    @ObfuscatedName("uf.al")
    public Object[][] field5150;

    @ObfuscatedName("uf.ai")
    public int[][] field5148;

    @ObfuscatedName("uf.ar")
    public int field5151 = -1;

    @ObfuscatedName("dh.aq(Lof;I)V")
    public static void method2273(class378 arg0) {
        Statics.field5152 = arg0;
    }

    @ObfuscatedName("qu.aw(II)Luf;")
    public static class527 method7272(int arg0) {
        class527 var1 = (class527) field5149.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5152.method6489(38, arg0);
        class527 var3 = new class527();
        if (var2 != null) {
            var3.method8496(new class534(var2));
        }
        var3.method8499();
        field5149.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("uf.al(Luq;I)V")
    public void method8496(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method8498(arg0, var2);
        }
    }

    @ObfuscatedName("uf.ai(II)[Ljava/lang/Object;")
    public Object[] method8507(int arg0) {
        return this.field5150 == null ? null : this.field5150[arg0];
    }

    @ObfuscatedName("uf.ar(Luq;II)V")
    public void method8498(class534 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method8591();
            if (this.field5150 == null) {
                this.field5150 = new Object[var3][];
                this.field5148 = new int[var3][];
            }
            for (int var4 = arg0.method8591(); var4 != 255; var4 = arg0.method8591()) {
                int var5 = arg0.method8591();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8820();
                }
                this.field5150[var4] = class528.method2029(arg0, var6);
                this.field5148[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field5151 = arg0.method8657();
        }
    }

    @ObfuscatedName("uf.as(B)V")
    public void method8499() {
    }

    @ObfuscatedName("gc.aa(I)V")
    public static void method3305() {
        field5149.method5418();
    }
}
