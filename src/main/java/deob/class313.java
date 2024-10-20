package deob;

@ObfuscatedName("mj")
public final class class313 {

    @ObfuscatedName("mj.ab")
    public int field3239;

    @ObfuscatedName("mj.ay")
    public int field3238;

    @ObfuscatedName("mj.an")
    public class521 field3241;

    @ObfuscatedName("mj.au")
    public class413 field3240;

    @ObfuscatedName("mj.ax")
    public class312 field3237;

    public class313(int arg0) {
        this(arg0, arg0);
    }

    public class313(int arg0, int arg1) {
        this.field3240 = new class413();
        this.field3239 = arg0;
        this.field3238 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3241 = new class521(var3);
    }

    @ObfuscatedName("mj.ab(J)Ljava/lang/Object;")
    public Object method5562(long arg0) {
        class317 var3 = (class317) this.field3241.method8512(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5581();
        if (var4 == null) {
            var3.method8218();
            var3.method8217();
            this.field3238 += var3.field3249;
            return null;
        }
        if (var3.method5583()) {
            class316 var5 = new class316(var4, var3.field3249);
            this.field3241.method8513(var5, var3.field5075);
            this.field3240.method7043(var5);
            var5.field5070 = 0L;
            var3.method8218();
            var3.method8217();
        } else {
            this.field3240.method7043(var3);
            var3.field5070 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("mj.ay(J)V")
    public void method5563(long arg0) {
        class317 var3 = (class317) this.field3241.method8512(arg0);
        this.method5564(var3);
    }

    @ObfuscatedName("mj.an(Lmu;)V")
    public void method5564(class317 arg0) {
        if (arg0 != null) {
            arg0.method8218();
            arg0.method8217();
            this.field3238 += arg0.field3249;
        }
    }

    @ObfuscatedName("mj.au(Ljava/lang/Object;J)V")
    public void method5565(Object arg0, long arg1) {
        this.method5566(arg0, arg1, 1);
    }

    @ObfuscatedName("mj.ax(Ljava/lang/Object;JI)V")
    public void method5566(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3239) {
            throw new IllegalStateException();
        }
        this.method5563(arg1);
        this.field3238 -= arg2;
        while (this.field3238 < 0) {
            class317 var5 = (class317) this.field3240.method7032();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5583()) {
            }
            this.method5564(var5);
            if (this.field3237 != null) {
                this.field3237.method5558(var5.method5581());
            }
        }
        class316 var6 = new class316(arg0, arg2);
        this.field3241.method8513(var6, arg1);
        this.field3240.method7043(var6);
        var6.field5070 = 0L;
    }

    @ObfuscatedName("mj.ao(I)V")
    public void method5567(int arg0) {
        for (class317 var2 = (class317) this.field3240.method7033(); var2 != null; var2 = (class317) this.field3240.method7035()) {
            if (var2.method5583()) {
                if (var2.method5581() == null) {
                    var2.method8218();
                    var2.method8217();
                    this.field3238 += var2.field3249;
                }
            } else if (++var2.field5070 > (long) arg0) {
                class314 var3 = new class314(var2.method5581(), var2.field3249);
                this.field3241.method8513(var3, var2.field5075);
                class413.method7031(var3, var2);
                var2.method8218();
                var2.method8217();
            }
        }
    }

    @ObfuscatedName("mj.am()V")
    public void method5560() {
        this.field3240.method7029();
        this.field3241.method8530();
        this.field3238 = this.field3239;
    }
}
