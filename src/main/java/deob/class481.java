package deob;

@ObfuscatedName("so")
public class class481 implements class68 {

    @ObfuscatedName("so.ap")
    public int field5039 = 0;

    @ObfuscatedName("so.aw")
    public int field5032;

    @ObfuscatedName("so.ak")
    public class104 field5038;

    @ObfuscatedName("so.aj")
    public final class275 field5031 = new class275();

    @ObfuscatedName("so.ai")
    public class482[] field5035 = new class482[10];

    @ObfuscatedName("so.ay")
    public int field5036 = 0;

    @ObfuscatedName("so.as")
    public class483 field5037 = new class484();

    @ObfuscatedName("so.ae")
    public boolean field5033 = false;

    public class481(int arg0, class104 arg1) {
        this.field5038 = arg1;
        this.field5036 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            this.field5035[var3] = new class482();
        }
    }

    @ObfuscatedName("so.au(I)V")
    public void method8448() {
        this.field5038.field1352.field2660 = this.field5038.field1344;
    }

    @ObfuscatedName("so.ap(B)I")
    public int method1225() {
        return this.field5031.method5345();
    }

    @ObfuscatedName("so.an(I)I")
    public int method8445() {
        return this.field5031.method5366();
    }

    @ObfuscatedName("so.aw(I)I")
    public int method1223() {
        return this.field5031.method5347();
    }

    @ObfuscatedName("so.ak(B)I")
    public int method1221() {
        return this.field5039;
    }

    @ObfuscatedName("so.ao(I)I")
    public int method8439() {
        return this.field5031.method5361();
    }

    @ObfuscatedName("so.af(I)I")
    public int method8440() {
        return Math.max(this.field5038.field1345, this.field5038.field1346) * 128;
    }

    @ObfuscatedName("so.ar(B)Lkt;")
    public class275 method8441() {
        return this.field5035[0].field5041;
    }

    @ObfuscatedName("so.ab(III)V")
    public void method8442(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field5036; var3++) {
            this.field5035[var3].field5041.method5355(arg0, arg1);
        }
        this.field5031.method5355(arg0, arg1);
        this.field5037.method8476(arg0, arg1);
    }

    @ObfuscatedName("so.az(Lkt;I)V")
    public final void method8443(class275 arg0) {
        int var2 = arg0.method5385();
        int var3 = arg0.method5349();
        if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            int var4 = arg0.method5345() - this.field5035[0].field5041.method5345();
            int var5 = arg0.method5347() - this.field5035[0].field5041.method5347();
            this.method8455(arg0, Math.abs(var4), Math.abs(var5));
        } else {
            this.method8444(arg0);
        }
    }

    @ObfuscatedName("so.ag(Lkt;I)V")
    public void method8444(class275 arg0) {
        this.field5031.method5351(arg0);
        this.field5035[0].field5041.method5351(arg0);
        this.field5036 = 0;
    }

    @ObfuscatedName("so.ad(Lkt;III)V")
    public void method8455(class275 arg0, int arg1, int arg2) {
        if (this.field5036 < 9) {
            this.field5036++;
        }
        for (int var4 = this.field5036; var4 > 0; var4--) {
            class482 var5 = this.field5035[var4];
            this.field5035[var4] = this.field5035[var4 - 1];
            this.field5035[var4 - 1] = var5;
        }
        this.field5035[0].field5041.method5351(arg0);
        this.field5035[0].field5042 = client.field518;
    }

    @ObfuscatedName("so.ac(II)V")
    public final void method8446(int arg0) {
        if (this.field5036 == 0) {
            this.method8444(this.field5035[0].field5041);
            return;
        }
        if (!this.field5033) {
            this.field5037.method8480(this.field5031, this.field5035[0], arg0);
            this.field5033 = true;
        }
        if (this.field5037.method8487(this.field5031, arg0, this.field5036)) {
            this.field5036--;
            this.field5033 = false;
        }
    }

    @ObfuscatedName("so.av(III)Lqt;")
    public class427 method8447(int arg0, int arg1) {
        class423 var3 = new class423();
        class429 var4 = class429.method3581();
        var3.field4753.method7600(class508.method6195(this.field5031.method5361()), 0.0F, 0.0F);
        var3.field4754.method7566((float) this.field5031.method5345(), 0.0F, (float) this.field5031.method5347());
        int var5 = arg0 - (this.field5038.field1345 * 64 + 64);
        int var6 = arg1 - (this.field5038.field1346 * 64 + 64);
        var4.method7625(var3);
        var3.method7493();
        class427 var7 = var4.method7632((float) var5, 0.0F, (float) var6);
        var4.method7650();
        return var7;
    }
}
