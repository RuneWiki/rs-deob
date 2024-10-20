package deob;

@ObfuscatedName("ls")
public final class class297 {

    @ObfuscatedName("ls.at")
    public int field3106;

    @ObfuscatedName("ls.ah")
    public int field3105;

    @ObfuscatedName("ls.ar")
    public class500 field3108;

    @ObfuscatedName("ls.ao")
    public class395 field3107;

    @ObfuscatedName("ls.ab")
    public class296 field3104;

    public class297(int arg0) {
        this(arg0, arg0);
    }

    public class297(int arg0, int arg1) {
        this.field3107 = new class395();
        this.field3106 = arg0;
        this.field3105 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3108 = new class500(var3);
    }

    @ObfuscatedName("ls.at(J)Ljava/lang/Object;")
    public Object method5254(long arg0) {
        class301 var3 = (class301) this.field3108.method8134(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5280();
        if (var4 == null) {
            var3.method7828();
            var3.method7825();
            this.field3105 += var3.field3116;
            return null;
        }
        if (var3.method5281()) {
            class300 var5 = new class300(var4, var3.field3116);
            this.field3108.method8135(var5, var3.field4849);
            this.field3107.method6696(var5);
            var5.field4843 = 0L;
            var3.method7828();
            var3.method7825();
        } else {
            this.field3107.method6696(var3);
            var3.field4843 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ls.ah(J)V")
    public void method5268(long arg0) {
        class301 var3 = (class301) this.field3108.method8134(arg0);
        this.method5256(var3);
    }

    @ObfuscatedName("ls.ar(Lla;)V")
    public void method5256(class301 arg0) {
        if (arg0 != null) {
            arg0.method7828();
            arg0.method7825();
            this.field3105 += arg0.field3116;
        }
    }

    @ObfuscatedName("ls.ao(Ljava/lang/Object;J)V")
    public void method5277(Object arg0, long arg1) {
        this.method5255(arg0, arg1, 1);
    }

    @ObfuscatedName("ls.ab(Ljava/lang/Object;JI)V")
    public void method5255(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3106) {
            throw new IllegalStateException();
        }
        this.method5268(arg1);
        this.field3105 -= arg2;
        while (this.field3105 < 0) {
            class301 var5 = (class301) this.field3107.method6698();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5281()) {
            }
            this.method5256(var5);
            if (this.field3104 != null) {
                this.field3104.method5251(var5.method5280());
            }
        }
        class300 var6 = new class300(arg0, arg2);
        this.field3108.method8135(var6, arg1);
        this.field3107.method6696(var6);
        var6.field4843 = 0L;
    }

    @ObfuscatedName("ls.au(I)V")
    public void method5267(int arg0) {
        for (class301 var2 = (class301) this.field3107.method6699(); var2 != null; var2 = (class301) this.field3107.method6701()) {
            if (var2.method5281()) {
                if (var2.method5280() == null) {
                    var2.method7828();
                    var2.method7825();
                    this.field3105 += var2.field3116;
                }
            } else if (++var2.field4843 > (long) arg0) {
                class298 var3 = new class298(var2.method5280(), var2.field3116);
                this.field3108.method8135(var3, var2.field4849);
                class395.method6697(var3, var2);
                var2.method7828();
                var2.method7825();
            }
        }
    }

    @ObfuscatedName("ls.aa()V")
    public void method5260() {
        this.field3107.method6706();
        this.field3108.method8136();
        this.field3105 = this.field3106;
    }
}
