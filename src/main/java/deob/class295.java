package deob;

@ObfuscatedName("ko")
public class class295 extends class287 {

    @ObfuscatedName("ko.m")
    public final class348 field3629;

    @ObfuscatedName("ko.k")
    public final class290 field3630;

    @ObfuscatedName("ko.e")
    public String field3633 = null;

    @ObfuscatedName("ko.s")
    public String field3631 = null;

    @ObfuscatedName("ko.p")
    public byte field3628;

    @ObfuscatedName("ko.n")
    public int field3632;

    @ObfuscatedName("ko.u")
    public int field3635 = 1;

    public class295(class348 arg0, class290 arg1) {
        super(100);
        this.field3629 = arg0;
        this.field3630 = arg1;
    }

    @ObfuscatedName("ko.x(I)Ljd;")
    public class284 method4730() {
        return new class283();
    }

    @ObfuscatedName("ko.m(II)[Ljd;")
    public class284[] method4731(int arg0) {
        return new class283[arg0];
    }

    @ObfuscatedName("ko.k(Ljava/lang/String;B)V")
    public final void method4874(String arg0) {
        this.field3633 = class299.method792(arg0);
    }

    @ObfuscatedName("ko.z(Ljava/lang/String;I)V")
    public final void method4875(String arg0) {
        this.field3631 = class299.method792(arg0);
    }

    @ObfuscatedName("ko.t(Lkb;I)V")
    public final void method4876(class310 arg0) {
        this.method4875(arg0.method5257());
        long var2 = arg0.method5143();
        this.method4874(class299.method3119(var2));
        this.field3628 = arg0.method5138();
        int var4 = arg0.method5137();
        if (var4 == 255) {
            return;
        }
        this.method4784();
        for (int var5 = 0; var5 < var4; var5++) {
            class283 var6 = (class283) this.method4751(new class293(arg0.method5257(), this.field3629));
            int var7 = arg0.method5139();
            var6.method4829(var7, ++this.field3635 - 1);
            var6.field3612 = arg0.method5138();
            arg0.method5257();
            this.method4880(var6);
        }
    }

    @ObfuscatedName("ko.ca(Lkb;I)V")
    public final void method4877(class310 arg0) {
        class293 var2 = new class293(arg0.method5257(), this.field3629);
        int var3 = arg0.method5139();
        byte var4 = arg0.method5138();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4743() == 0) {
                return;
            }
            class283 var6 = (class283) this.method4747(var2);
            if (var6 != null && var6.method4830() == var3) {
                this.method4817(var6);
            }
            return;
        }
        arg0.method5257();
        class283 var7 = (class283) this.method4747(var2);
        if (var7 == null) {
            if (this.method4743() > this.field3601) {
                return;
            }
            var7 = (class283) this.method4751(var2);
        }
        var7.method4829(var3, ++this.field3635 - 1);
        var7.field3612 = var4;
        this.method4880(var7);
    }

    @ObfuscatedName("ko.cj(I)V")
    public final void method4878() {
        for (int var1 = 0; var1 < this.method4743(); var1++) {
            ((class283) this.method4818(var1)).method4670();
        }
    }

    @ObfuscatedName("ko.cp(I)V")
    public final void method4883() {
        for (int var1 = 0; var1 < this.method4743(); var1++) {
            ((class283) this.method4818(var1)).method4685();
        }
    }

    @ObfuscatedName("ko.ck(Ljt;I)V")
    public final void method4880(class283 arg0) {
        if (arg0.method4696().equals(this.field3630.method1375())) {
            this.field3632 = arg0.field3612;
        }
    }
}
