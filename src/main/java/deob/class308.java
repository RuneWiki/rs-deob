package deob;

@ObfuscatedName("kd")
public class class308 extends class300 {

    @ObfuscatedName("kd.z")
    public final class336 field3860;

    @ObfuscatedName("kd.n")
    public final class303 field3858;

    @ObfuscatedName("kd.x")
    public String field3859 = null;

    @ObfuscatedName("kd.m")
    public String field3857 = null;

    @ObfuscatedName("kd.h")
    public byte field3861;

    @ObfuscatedName("kd.t")
    public int field3862;

    @ObfuscatedName("kd.i")
    public int field3863 = 1;

    public class308(class336 arg0, class303 arg1) {
        super(100);
        this.field3860 = arg0;
        this.field3858 = arg1;
    }

    @ObfuscatedName("kd.d(I)Lkm;")
    public class297 method4997() {
        return new class296();
    }

    @ObfuscatedName("kd.z(II)[Lkm;")
    public class297[] method4987(int arg0) {
        return new class296[arg0];
    }

    @ObfuscatedName("kd.n(Ljava/lang/String;B)V")
    public final void method5120(String arg0) {
        String var2 = class317.method955(class317.method184(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3859 = var2;
    }

    @ObfuscatedName("kd.h(Ljava/lang/String;B)V")
    public final void method5121(String arg0) {
        String var2 = class317.method955(class317.method184(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3857 = var2;
    }

    @ObfuscatedName("kd.t(Lgy;I)V")
    public final void method5132(class195 arg0) {
        this.method5121(arg0.method3268());
        long var2 = arg0.method3265();
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
                var10.append(class317.field3915[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5120(var6);
        this.field3861 = arg0.method3421();
        int var13 = arg0.method3330();
        if (var13 == 255) {
            return;
        }
        this.method4999();
        for (int var14 = 0; var14 < var13; var14++) {
            class296 var15 = (class296) this.method5034(new class306(arg0.method3268(), this.field3860));
            int var16 = arg0.method3269();
            var15.method5085(var16, ++this.field3863 - 1);
            var15.field3839 = arg0.method3421();
            arg0.method3268();
            this.method5125(var15);
        }
    }

    @ObfuscatedName("kd.i(Lgy;I)V")
    public final void method5123(class195 arg0) {
        class306 var2 = new class306(arg0.method3268(), this.field3860);
        int var3 = arg0.method3269();
        byte var4 = arg0.method3421();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5000() == 0) {
                return;
            }
            class296 var6 = (class296) this.method5004(var2);
            if (var6 != null && var6.method5079() == var3) {
                this.method5006(var6);
            }
            return;
        }
        arg0.method3268();
        class296 var7 = (class296) this.method5035(var2);
        if (var7 == null) {
            if (this.method5000() > this.field3835) {
                return;
            }
            var7 = (class296) this.method5034(var2);
        }
        var7.method5085(var3, ++this.field3863 - 1);
        var7.field3839 = var4;
        this.method5125(var7);
    }

    @ObfuscatedName("kd.cp(B)V")
    public final void method5122() {
        for (int var1 = 0; var1 < this.method5000(); var1++) {
            ((class296) this.method5009(var1)).method4935();
        }
    }

    @ObfuscatedName("kd.ch(I)V")
    public final void method5124() {
        for (int var1 = 0; var1 < this.method5000(); var1++) {
            ((class296) this.method5009(var1)).method4934();
        }
    }

    @ObfuscatedName("kd.cr(Lku;I)V")
    public final void method5125(class296 arg0) {
        if (arg0.method4975().equals(this.field3858.method1111())) {
            this.field3862 = arg0.field3839;
        }
    }
}
