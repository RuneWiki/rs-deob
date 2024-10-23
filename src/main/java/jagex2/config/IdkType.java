package jagex2.config;

import deob.ObfuscatedName;
import deob.Statics;
import jagex2.datastruct.DoublyLinkable;
import jagex2.datastruct.LruCache;
import jagex2.graphics.Model;
import jagex2.io.Packet;

@ObfuscatedName("fd")
public class IdkType extends DoublyLinkable {

    @ObfuscatedName("fd.g")
    public static LruCache field2396 = new LruCache(64);

    @ObfuscatedName("fd.q")
    public int field2403 = -1;

    @ObfuscatedName("fd.i")
    public int[] field2398;

    @ObfuscatedName("fd.s")
    public short[] field2399;

    @ObfuscatedName("fd.u")
    public short[] field2400;

    @ObfuscatedName("fd.v")
    public short[] field2401;

    @ObfuscatedName("fd.w")
    public short[] field2402;

    @ObfuscatedName("fd.e")
    public int[] field2395 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("fd.b")
    public boolean field2404 = false;

    @ObfuscatedName("p.g(II)Lfd;")
    public static IdkType method346(int arg0) {
        IdkType var1 = (IdkType) field2396.method1244((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2394.method1044(3, arg0);
        IdkType var3 = new IdkType();
        if (var2 != null) {
            var3.method2464(new Packet(var2));
        }
        field2396.method1246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fd.q(Lev;I)V")
    public void method2464(Packet arg0) {
        while (true) {
            int var2 = arg0.method1600();
            if (var2 == 0) {
                return;
            }
            this.method2478(arg0, var2);
        }
    }

    @ObfuscatedName("fd.i(Lev;II)V")
    public void method2478(Packet arg0, int arg1) {
        if (arg1 == 1) {
            this.field2403 = arg0.method1600();
        } else if (arg1 == 2) {
            int var3 = arg0.method1600();
            this.field2398 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2398[var4] = arg0.method1602();
            }
        } else if (arg1 == 3) {
            this.field2404 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method1600();
            this.field2399 = new short[var5];
            this.field2400 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2399[var6] = (short) arg0.method1602();
                this.field2400[var6] = (short) arg0.method1602();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method1600();
            this.field2401 = new short[var7];
            this.field2402 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2401[var8] = (short) arg0.method1602();
                this.field2402[var8] = (short) arg0.method1602();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2395[arg1 - 60] = arg0.method1602();
        }
    }

    @ObfuscatedName("fd.s(I)Z")
    public boolean method2461() {
        if (this.field2398 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2398.length; var2++) {
            if (!Statics.field2397.method1046(this.field2398[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fd.u(S)Lfw;")
    public Model method2465() {
        if (this.field2398 == null) {
            return null;
        }
        Model[] var1 = new Model[this.field2398.length];
        for (int var2 = 0; var2 < this.field2398.length; var2++) {
            var1[var2] = Model.method2992(Statics.field2397, this.field2398[var2], 0);
        }
        Model var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new Model(var1, var1.length);
        }
        if (this.field2399 != null) {
            for (int var4 = 0; var4 < this.field2399.length; var4++) {
                var3.method2935(this.field2399[var4], this.field2400[var4]);
            }
        }
        if (this.field2401 != null) {
            for (int var5 = 0; var5 < this.field2401.length; var5++) {
                var3.method2976(this.field2401[var5], this.field2402[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("fd.v(B)Z")
    public boolean method2463() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2395[var2] != -1 && !Statics.field2397.method1046(this.field2395[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fd.w(B)Lfw;")
    public Model method2480() {
        Model[] var1 = new Model[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2395[var3] != -1) {
                var1[var2++] = Model.method2992(Statics.field2397, this.field2395[var3], 0);
            }
        }
        Model var4 = new Model(var1, var2);
        if (this.field2399 != null) {
            for (int var5 = 0; var5 < this.field2399.length; var5++) {
                var4.method2935(this.field2399[var5], this.field2400[var5]);
            }
        }
        if (this.field2401 != null) {
            for (int var6 = 0; var6 < this.field2401.length; var6++) {
                var4.method2976(this.field2401[var6], this.field2402[var6]);
            }
        }
        return var4;
    }
}
