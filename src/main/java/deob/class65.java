package deob;

@ObfuscatedName("ck")
public class class65 extends class501 {

    @ObfuscatedName("ck.aq")
    public int field448;

    @ObfuscatedName("ck.ad")
    public int field449;

    @ObfuscatedName("ck.ag")
    public int field450;

    @ObfuscatedName("ck.ak")
    public String field451;

    @ObfuscatedName("ck.ap")
    public class569 field452;

    @ObfuscatedName("ck.an")
    public class476 field453 = class476.field4959;

    @ObfuscatedName("ck.aj")
    public class476 field454 = class476.field4959;

    @ObfuscatedName("ck.av")
    public String field455;

    @ObfuscatedName("ck.ab")
    public String field456;

    public class65(int arg0, String arg1, String arg2, String arg3) {
        this.method1138(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ck.aq(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1138(int arg0, String arg1, String arg2, String arg3) {
        int var5 = ++class114.field1449 - 1;
        this.field448 = var5;
        this.field449 = client.field516;
        this.field450 = arg0;
        this.field451 = arg1;
        this.method1128();
        this.field455 = arg2;
        this.field456 = arg3;
        this.method1143();
        this.method1125();
    }

    @ObfuscatedName("ck.ad(I)V")
    public void method1143() {
        this.field453 = class476.field4959;
    }

    @ObfuscatedName("ck.ag(B)Z")
    public final boolean method1129() {
        if (class476.field4959 == this.field453) {
            this.method1124();
        }
        return class476.field4960 == this.field453;
    }

    @ObfuscatedName("ck.ak(B)V")
    public void method1124() {
        this.field453 = Statics.field1599.field837.method7869(this.field452) ? class476.field4960 : class476.field4961;
    }

    @ObfuscatedName("ck.ap(B)V")
    public void method1125() {
        this.field454 = class476.field4959;
    }

    @ObfuscatedName("ck.an(B)Z")
    public final boolean method1126() {
        if (class476.field4959 == this.field454) {
            this.method1127();
        }
        return class476.field4960 == this.field454;
    }

    @ObfuscatedName("ck.aj(I)V")
    public void method1127() {
        this.field454 = Statics.field1599.field835.method7869(this.field452) ? class476.field4960 : class476.field4961;
    }

    @ObfuscatedName("ck.av(I)V")
    public final void method1128() {
        if (this.field451 == null) {
            this.field452 = null;
        } else {
            this.field452 = new class569(client.method8419(this.field451), Statics.field992);
        }
    }
}
