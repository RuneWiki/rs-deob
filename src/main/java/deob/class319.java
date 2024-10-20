package deob;

@ObfuscatedName("lj")
public class class319 extends class325 {

    @ObfuscatedName("lj.e")
    public final class366 field3823;

    @ObfuscatedName("lj.v")
    public final class317 field3817;

    @ObfuscatedName("lj.y")
    public String field3818 = null;

    @ObfuscatedName("lj.j")
    public String field3819 = null;

    @ObfuscatedName("lj.o")
    public byte field3820;

    @ObfuscatedName("lj.m")
    public int field3824;

    @ObfuscatedName("lj.r")
    public int field3822 = 1;

    public class319(class366 arg0, class317 arg1) {
        super(100);
        this.field3823 = arg0;
        this.field3817 = arg1;
    }

    @ObfuscatedName("lj.f(I)Llf;")
    public class323 method5102() {
        return new class322();
    }

    @ObfuscatedName("lj.e(II)[Llf;")
    public class323[] method5108(int arg0) {
        return new class322[arg0];
    }

    @ObfuscatedName("lj.v(Ljava/lang/String;I)V")
    public final void method5119(String arg0) {
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        String var9 = class307.method1768(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3818 = var9;
    }

    @ObfuscatedName("lj.d(Ljava/lang/String;I)V")
    public final void method5120(String arg0) {
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        String var9 = class307.method1768(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3819 = var9;
    }

    @ObfuscatedName("lj.z(Lnt;I)V")
    public final void method5134(class384 arg0) {
        this.method5120(arg0.method5906());
        long var2 = arg0.method5896();
        long var4 = var2;
        String var6;
        if (var2 <= 0L || var2 >= 6582952005840035281L) {
            var6 = null;
        } else if (var2 % 37L == 0L) {
            var6 = null;
        } else {
            int var7 = 0;
            for (long var8 = var2; var8 != 0L; var8 /= 37L) {
                var7++;
            }
            StringBuilder var10 = new StringBuilder(var7);
            while (var4 != 0L) {
                long var11 = var4;
                var4 /= 37L;
                var10.append(class307.field3756[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5119(var6);
        this.field3820 = arg0.method5968();
        int var13 = arg0.method5902();
        if (var13 == 255) {
            return;
        }
        this.method5198();
        for (int var14 = 0; var14 < var13; var14++) {
            class322 var15 = (class322) this.method5227(new class329(arg0.method5906(), this.field3823));
            int var16 = arg0.method5899();
            var15.method5256(var16, ++this.field3822 - 1);
            var15.field3849 = arg0.method5968();
            arg0.method5906();
            this.method5124(var15);
        }
    }

    @ObfuscatedName("lj.b(Lnt;I)V")
    public final void method5135(class384 arg0) {
        class329 var2 = new class329(arg0.method5906(), this.field3823);
        int var3 = arg0.method5899();
        byte var4 = arg0.method5968();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5199() == 0) {
                return;
            }
            class322 var6 = (class322) this.method5202(var2);
            if (var6 != null && var6.method5261() == var3) {
                this.method5205(var6);
            }
            return;
        }
        arg0.method5906();
        class322 var7 = (class322) this.method5202(var2);
        if (var7 == null) {
            if (this.method5199() > this.field3841) {
                return;
            }
            var7 = (class322) this.method5227(var2);
        }
        var7.method5256(var3, ++this.field3822 - 1);
        var7.field3849 = var4;
        this.method5124(var7);
    }

    @ObfuscatedName("lj.i(B)V")
    public final void method5122() {
        for (int var1 = 0; var1 < this.method5199(); var1++) {
            ((class322) this.method5208(var1)).method5166();
        }
    }

    @ObfuscatedName("lj.k(I)V")
    public final void method5123() {
        for (int var1 = 0; var1 < this.method5199(); var1++) {
            ((class322) this.method5208(var1)).method5172();
        }
    }

    @ObfuscatedName("lj.g(Llt;I)V")
    public final void method5124(class322 arg0) {
        if (arg0.method5177().equals(this.field3817.method1331())) {
            this.field3824 = arg0.field3849;
        }
    }
}
