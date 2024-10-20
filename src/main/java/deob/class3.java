package deob;

@ObfuscatedName("v")
public class class3 {

    @ObfuscatedName("v.f")
    public long field19;

    @ObfuscatedName("v.e")
    public int field14 = -1;

    @ObfuscatedName("v.v")
    public class297 field15 = new class297();

    public class3(class384 arg0) {
        this.method15(arg0);
    }

    @ObfuscatedName("v.f(Lnt;I)V")
    public void method15(class384 arg0) {
        this.field19 = arg0.method5896();
        this.field14 = arg0.method5965();
        for (int var2 = arg0.method5902(); var2 != 0; var2 = arg0.method5902()) {
            class15 var3;
            if (var2 == 3) {
                var3 = new class14(this);
            } else if (var2 == 1) {
                var3 = new class9(this);
            } else if (var2 == 13) {
                var3 = new class27(this);
            } else if (var2 == 4) {
                var3 = new class18(this);
            } else if (var2 == 6) {
                var3 = new class11(this);
            } else if (var2 == 5) {
                var3 = new class23(this);
            } else if (var2 == 2) {
                var3 = new class24(this);
            } else if (var2 == 7) {
                var3 = new class22(this);
            } else if (var2 == 14) {
                var3 = new class19(this);
            } else if (var2 == 8) {
                var3 = new class7(this);
            } else if (var2 == 9) {
                var3 = new class1(this);
            } else if (var2 == 10) {
                var3 = new class5(this);
            } else if (var2 == 11) {
                var3 = new class2(this);
            } else if (var2 == 12) {
                var3 = new class16(this);
            } else if (var2 == 15) {
                var3 = new class28(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method11(arg0);
            this.field15.method4768(var3);
        }
    }

    @ObfuscatedName("v.e(Lb;B)V")
    public void method16(class12 arg0) {
        if (this.field19 != arg0.field83 || this.field14 != arg0.field84) {
            throw new RuntimeException("");
        }
        for (class15 var2 = (class15) this.field15.method4771(); var2 != null; var2 = (class15) this.field15.method4773()) {
            var2.method3(arg0);
        }
        arg0.field84++;
    }
}
