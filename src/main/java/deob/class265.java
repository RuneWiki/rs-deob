package deob;

@ObfuscatedName("jo")
public class class265 extends class207 {

    @ObfuscatedName("jo.w")
    public static class201 field3329 = new class201(64);

    @ObfuscatedName("jo.s")
    public char field3332;

    @ObfuscatedName("jo.l")
    public int field3331;

    @ObfuscatedName("jo.u")
    public String field3334;

    @ObfuscatedName("jo.q")
    public boolean field3333 = true;

    @ObfuscatedName("jo.w(B)V")
    public void method4563() {
    }

    @ObfuscatedName("jo.s(Lgk;B)V")
    public void method4557(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4559(arg0, var2);
        }
    }

    @ObfuscatedName("jo.l(Lgk;IB)V")
    public void method4559(class183 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3384();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class302.field3715[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3332 = var6;
        } else if (arg1 == 2) {
            this.field3331 = arg0.method3374();
        } else if (arg1 == 4) {
            this.field3333 = false;
        } else if (arg1 == 5) {
            this.field3334 = arg0.method3441();
        }
    }

    @ObfuscatedName("jo.u(I)Z")
    public boolean method4560() {
        return this.field3332 == 's';
    }
}
