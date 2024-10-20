package deob;

@ObfuscatedName("mh")
public final class class315 {

    @ObfuscatedName("mh.ac")
    public int field3286;

    @ObfuscatedName("mh.ae")
    public int field3284;

    @ObfuscatedName("mh.ag")
    public class523 field3283;

    @ObfuscatedName("mh.am")
    public class415 field3285;

    @ObfuscatedName("mh.ax")
    public class314 field3287;

    public class315(int arg0) {
        this(arg0, arg0);
    }

    public class315(int arg0, int arg1) {
        this.field3285 = new class415();
        this.field3286 = arg0;
        this.field3284 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3283 = new class523(var3);
    }

    @ObfuscatedName("mh.ac(J)Ljava/lang/Object;")
    public Object method5703(long arg0) {
        class319 var3 = (class319) this.field3283.method8666(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5728();
        if (var4 == null) {
            var3.method8362();
            var3.method8359();
            this.field3284 += var3.field3295;
            return null;
        }
        if (var3.method5726()) {
            class318 var5 = new class318(var4, var3.field3295);
            this.field3283.method8663(var5, var3.field5122);
            this.field3285.method7157(var5);
            var5.field5116 = 0L;
            var3.method8362();
            var3.method8359();
        } else {
            this.field3285.method7157(var3);
            var3.field5116 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("mh.ae(J)V")
    public void method5720(long arg0) {
        class319 var3 = (class319) this.field3283.method8666(arg0);
        this.method5723(var3);
    }

    @ObfuscatedName("mh.ag(Lmb;)V")
    public void method5723(class319 arg0) {
        if (arg0 != null) {
            arg0.method8362();
            arg0.method8359();
            this.field3284 += arg0.field3295;
        }
    }

    @ObfuscatedName("mh.am(Ljava/lang/Object;J)V")
    public void method5706(Object arg0, long arg1) {
        this.method5704(arg0, arg1, 1);
    }

    @ObfuscatedName("mh.ax(Ljava/lang/Object;JI)V")
    public void method5704(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3286) {
            throw new IllegalStateException();
        }
        this.method5720(arg1);
        this.field3284 -= arg2;
        while (this.field3284 < 0) {
            class319 var5 = (class319) this.field3285.method7163();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5726()) {
            }
            this.method5723(var5);
            if (this.field3287 != null) {
                this.field3287.method5698(var5.method5728());
            }
        }
        class318 var6 = new class318(arg0, arg2);
        this.field3283.method8663(var6, arg1);
        this.field3285.method7157(var6);
        var6.field5116 = 0L;
    }

    @ObfuscatedName("mh.aq(I)V")
    public void method5708(int arg0) {
        for (class319 var2 = (class319) this.field3285.method7173(); var2 != null; var2 = (class319) this.field3285.method7155()) {
            if (var2.method5726()) {
                if (var2.method5728() == null) {
                    var2.method8362();
                    var2.method8359();
                    this.field3284 += var2.field3295;
                }
            } else if (++var2.field5116 > (long) arg0) {
                class316 var3 = new class316(var2.method5728(), var2.field3295);
                this.field3283.method8663(var3, var2.field5122);
                class415.method7158(var3, var2);
                var2.method8362();
                var2.method8359();
            }
        }
    }

    @ObfuscatedName("mh.af()V")
    public void method5709() {
        this.field3285.method7165();
        this.field3283.method8664();
        this.field3284 = this.field3286;
    }
}
