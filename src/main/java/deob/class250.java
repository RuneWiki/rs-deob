package deob;

@ObfuscatedName("iy")
public class class250 extends class176 {

    @ObfuscatedName("iy.t")
    public static class146 field3292 = new class146(64);

    @ObfuscatedName("iy.n")
    public char field3291;

    @ObfuscatedName("iy.q")
    public int field3294;

    @ObfuscatedName("iy.v")
    public String field3295;

    @ObfuscatedName("iy.l")
    public boolean field3296 = true;

    @ObfuscatedName("fy.a(IB)Liy;")
    public static class250 method3249(int arg0) {
        class250 var1 = (class250) field3292.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3293.method3873(11, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4207(new class300(var2));
        }
        var3.method4208();
        field3292.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.t(I)V")
    public void method4208() {
    }

    @ObfuscatedName("iy.n(Lkc;I)V")
    public void method4207(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4209(arg0, var2);
        }
    }

    @ObfuscatedName("iy.q(Lkc;II)V")
    public void method4209(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3291 = class288.method4825(arg0.method5268());
        } else if (arg1 == 2) {
            this.field3294 = arg0.method5155();
        } else if (arg1 == 4) {
            this.field3296 = false;
        } else if (arg1 == 5) {
            this.field3295 = arg0.method5132();
        }
    }

    @ObfuscatedName("iy.v(I)Z")
    public boolean method4210() {
        return this.field3291 == 's';
    }
}
