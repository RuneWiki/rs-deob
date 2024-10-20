package deob;

@ObfuscatedName("ja")
public class class263 extends class206 {

    @ObfuscatedName("ja.v")
    public static class201 field3481 = new class201(64);

    @ObfuscatedName("ja.y")
    public char field3476;

    @ObfuscatedName("ja.r")
    public int field3478;

    @ObfuscatedName("ja.h")
    public String field3479;

    @ObfuscatedName("ja.d")
    public boolean field3477 = true;

    @ObfuscatedName("aj.n(Lil;I)V")
    public static void method482(class247 arg0) {
        Statics.field3480 = arg0;
    }

    @ObfuscatedName("ja.y(I)V")
    public void method4217() {
    }

    @ObfuscatedName("ja.r(Lgv;B)V")
    public void method4214(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4220(arg0, var2);
        }
    }

    @ObfuscatedName("ja.h(Lgv;II)V")
    public void method4220(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3476 = class278.method237(arg0.method3022());
        } else if (arg1 == 2) {
            this.field3478 = arg0.method3026();
        } else if (arg1 == 4) {
            this.field3477 = false;
        } else if (arg1 == 5) {
            this.field3479 = arg0.method3030();
        }
    }

    @ObfuscatedName("ja.d(I)Z")
    public boolean method4216() {
        return this.field3476 == 's';
    }
}
