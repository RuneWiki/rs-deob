package deob;

@ObfuscatedName("kv")
public class class296 extends class288 {

    @ObfuscatedName("kv.b")
    public final class349 field3667;

    @ObfuscatedName("kv.l")
    public final class291 field3662;

    @ObfuscatedName("kv.t")
    public String field3664 = null;

    @ObfuscatedName("kv.e")
    public String field3665 = null;

    @ObfuscatedName("kv.o")
    public byte field3666;

    @ObfuscatedName("kv.n")
    public int field3668;

    @ObfuscatedName("kv.x")
    public int field3663 = 1;

    public class296(class349 arg0, class291 arg1) {
        super(100);
        this.field3667 = arg0;
        this.field3662 = arg1;
    }

    @ObfuscatedName("kv.f(I)Ljh;")
    public class285 method4799() {
        return new class284();
    }

    @ObfuscatedName("kv.b(IB)[Ljh;")
    public class285[] method4797(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("kv.l(Ljava/lang/String;I)V")
    public final void method4923(String arg0) {
        this.field3664 = class300.method2021(arg0);
    }

    @ObfuscatedName("kv.u(Ljava/lang/String;I)V")
    public final void method4922(String arg0) {
        this.field3665 = class300.method2021(arg0);
    }

    @ObfuscatedName("kv.t(Lkb;S)V")
    public final void method4924(class311 arg0) {
        this.method4922(arg0.method5189());
        long var2 = arg0.method5186();
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
                var10.append(class300.field3678[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method4923(var6);
        this.field3666 = arg0.method5181();
        int var13 = arg0.method5276();
        if (var13 == 255) {
            return;
        }
        this.method4808();
        for (int var14 = 0; var14 < var13; var14++) {
            class284 var15 = (class284) this.method4820(new class294(arg0.method5189(), this.field3667));
            int var16 = arg0.method5163();
            var15.method4891(var16, ++this.field3663 - 1);
            var15.field3643 = arg0.method5181();
            arg0.method5189();
            this.method4928(var15);
        }
    }

    @ObfuscatedName("kv.e(Lkb;S)V")
    public final void method4925(class311 arg0) {
        class294 var2 = new class294(arg0.method5189(), this.field3667);
        int var3 = arg0.method5163();
        byte var4 = arg0.method5181();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4816() == 0) {
                return;
            }
            class284 var6 = (class284) this.method4827(var2);
            if (var6 != null && var6.method4881() == var3) {
                this.method4815(var6);
            }
            return;
        }
        arg0.method5189();
        class284 var7 = (class284) this.method4827(var2);
        if (var7 == null) {
            if (this.method4816() > this.field3632) {
                return;
            }
            var7 = (class284) this.method4820(var2);
        }
        var7.method4891(var3, ++this.field3663 - 1);
        var7.field3643 = var4;
        this.method4928(var7);
    }

    @ObfuscatedName("kv.ci(I)V")
    public final void method4926() {
        for (int var1 = 0; var1 < this.method4816(); var1++) {
            ((class284) this.method4817(var1)).method4753();
        }
    }

    @ObfuscatedName("kv.cy(I)V")
    public final void method4927() {
        for (int var1 = 0; var1 < this.method4816(); var1++) {
            ((class284) this.method4817(var1)).method4747();
        }
    }

    @ObfuscatedName("kv.cx(Ljf;I)V")
    public final void method4928(class284 arg0) {
        if (arg0.method4780().equals(this.field3662.method1243())) {
            this.field3668 = arg0.field3643;
        }
    }
}
