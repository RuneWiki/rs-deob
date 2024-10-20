package deob;

@ObfuscatedName("ls")
public final class class300 {

    @ObfuscatedName("ls.ac")
    public int field3112;

    @ObfuscatedName("ls.al")
    public int field3113;

    @ObfuscatedName("ls.ak")
    public class503 field3111;

    @ObfuscatedName("ls.ax")
    public class398 field3114;

    @ObfuscatedName("ls.ao")
    public class299 field3115;

    public class300(int arg0) {
        this(arg0, arg0);
    }

    public class300(int arg0, int arg1) {
        this.field3114 = new class398();
        this.field3112 = arg0;
        this.field3113 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3111 = new class503(var3);
    }

    @ObfuscatedName("ls.ac(J)Ljava/lang/Object;")
    public Object method5255(long arg0) {
        class304 var3 = (class304) this.field3111.method8070(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5277();
        if (var4 == null) {
            var3.method7776();
            var3.method7774();
            this.field3113 += var3.field3123;
            return null;
        }
        if (var3.method5281()) {
            class303 var5 = new class303(var4, var3.field3123);
            this.field3111.method8071(var5, var3.field4857);
            this.field3114.method6656(var5);
            var5.field4851 = 0L;
            var3.method7776();
            var3.method7774();
        } else {
            this.field3114.method6656(var3);
            var3.field4851 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ls.al(J)V")
    public void method5256(long arg0) {
        class304 var3 = (class304) this.field3111.method8070(arg0);
        this.method5257(var3);
    }

    @ObfuscatedName("ls.ak(Llb;)V")
    public void method5257(class304 arg0) {
        if (arg0 != null) {
            arg0.method7776();
            arg0.method7774();
            this.field3113 += arg0.field3123;
        }
    }

    @ObfuscatedName("ls.ax(Ljava/lang/Object;J)V")
    public void method5272(Object arg0, long arg1) {
        this.method5254(arg0, arg1, 1);
    }

    @ObfuscatedName("ls.ao(Ljava/lang/Object;JI)V")
    public void method5254(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3112) {
            throw new IllegalStateException();
        }
        this.method5256(arg1);
        this.field3113 -= arg2;
        while (this.field3113 < 0) {
            class304 var5 = (class304) this.field3114.method6658();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5281()) {
            }
            this.method5257(var5);
            if (this.field3115 != null) {
                this.field3115.method5250(var5.method5277());
            }
        }
        class303 var6 = new class303(arg0, arg2);
        this.field3111.method8071(var6, arg1);
        this.field3114.method6656(var6);
        var6.field4851 = 0L;
    }

    @ObfuscatedName("ls.ah(I)V")
    public void method5268(int arg0) {
        for (class304 var2 = (class304) this.field3114.method6659(); var2 != null; var2 = (class304) this.field3114.method6673()) {
            if (var2.method5281()) {
                if (var2.method5277() == null) {
                    var2.method7776();
                    var2.method7774();
                    this.field3113 += var2.field3123;
                }
            } else if (++var2.field4851 > (long) arg0) {
                class301 var3 = new class301(var2.method5277(), var2.field3123);
                this.field3111.method8071(var3, var2.field4857);
                class398.method6676(var3, var2);
                var2.method7776();
                var2.method7774();
            }
        }
    }

    @ObfuscatedName("ls.ar()V")
    public void method5270() {
        this.field3114.method6666();
        this.field3111.method8072();
        this.field3113 = this.field3112;
    }
}
