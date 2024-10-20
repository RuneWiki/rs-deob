package deob;

@ObfuscatedName("kt")
public class class296 extends class288 {

    @ObfuscatedName("kt.v")
    public final class349 field3667;

    @ObfuscatedName("kt.d")
    public final class291 field3665;

    @ObfuscatedName("kt.l")
    public String field3668 = null;

    @ObfuscatedName("kt.s")
    public String field3670 = null;

    @ObfuscatedName("kt.b")
    public byte field3666;

    @ObfuscatedName("kt.a")
    public int field3671;

    @ObfuscatedName("kt.w")
    public int field3672 = 1;

    public class296(class349 arg0, class291 arg1) {
        super(100);
        this.field3667 = arg0;
        this.field3665 = arg1;
    }

    @ObfuscatedName("kt.n(I)Ljn;")
    public class285 method4873() {
        return new class284();
    }

    @ObfuscatedName("kt.v(II)[Ljn;")
    public class285[] method4874(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("kt.d(Ljava/lang/String;I)V")
    public final void method4987(String arg0) {
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
        String var9 = class300.method2178(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3668 = var9;
    }

    @ObfuscatedName("kt.bk(Ljava/lang/String;B)V")
    public final void method4988(String arg0) {
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
        String var9 = class300.method2178(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3670 = var9;
    }

    @ObfuscatedName("kt.bu(Lkx;B)V")
    public final void method4989(class311 arg0) {
        this.method4988(arg0.method5465());
        long var2 = arg0.method5251();
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
                var10.append(class300.field3683[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method4987(var6);
        this.field3666 = arg0.method5293();
        int var13 = arg0.method5310();
        if (var13 == 255) {
            return;
        }
        this.method4881();
        for (int var14 = 0; var14 < var13; var14++) {
            class284 var15 = (class284) this.method4889(new class294(arg0.method5465(), this.field3667));
            int var16 = arg0.method5247();
            var15.method4947(var16, ++this.field3672 - 1);
            var15.field3646 = arg0.method5293();
            arg0.method5465();
            this.method4992(var15);
        }
    }

    @ObfuscatedName("kt.bo(Lkx;I)V")
    public final void method4993(class311 arg0) {
        class294 var2 = new class294(arg0.method5465(), this.field3667);
        int var3 = arg0.method5247();
        byte var4 = arg0.method5293();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4882() == 0) {
                return;
            }
            class284 var6 = (class284) this.method4892(var2);
            if (var6 != null && var6.method4948() == var3) {
                this.method4888(var6);
            }
            return;
        }
        arg0.method5465();
        class284 var7 = (class284) this.method4892(var2);
        if (var7 == null) {
            if (this.method4882() > this.field3639) {
                return;
            }
            var7 = (class284) this.method4889(var2);
        }
        var7.method4947(var3, ++this.field3672 - 1);
        var7.field3646 = var4;
        this.method4992(var7);
    }

    @ObfuscatedName("kt.cv(S)V")
    public final void method5007() {
        for (int var1 = 0; var1 < this.method4882(); var1++) {
            ((class284) this.method4883(var1)).method4816();
        }
    }

    @ObfuscatedName("kt.cd(I)V")
    public final void method4991() {
        for (int var1 = 0; var1 < this.method4882(); var1++) {
            ((class284) this.method4883(var1)).method4830();
        }
    }

    @ObfuscatedName("kt.cq(Ljb;I)V")
    public final void method4992(class284 arg0) {
        if (arg0.method4851().equals(this.field3665.method1494())) {
            this.field3671 = arg0.field3646;
        }
    }
}
