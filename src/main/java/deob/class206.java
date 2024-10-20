package deob;

@ObfuscatedName("he")
public class class206 implements class30 {

    @ObfuscatedName("he.af")
    public class317 field2340 = null;

    @ObfuscatedName("he.an")
    public boolean field2335 = false;

    @ObfuscatedName("he.aw")
    public boolean field2337 = false;

    @ObfuscatedName("he.ax(Lmq;I)V")
    public void method3861(class317 arg0) {
        this.method3863();
        if (arg0 == null) {
            return;
        }
        this.field2340 = arg0;
        class313 var2 = arg0.method5800();
        if (var2 == null) {
            return;
        }
        var2.field3503.method5492(true);
        if (var2.field3501 != null) {
            class84 var3 = new class84();
            var3.method2150(arg0);
            var3.method2148(var2.field3501);
            client.method6208().method6324(var3);
        }
    }

    @ObfuscatedName("he.ai(S)Lmq;")
    public class317 method3872() {
        return this.field2340;
    }

    @ObfuscatedName("he.ag(B)V")
    public void method3863() {
        if (this.field2340 == null) {
            return;
        }
        class313 var1 = this.field2340.method5800();
        class317 var2 = this.field2340;
        this.field2340 = null;
        if (var1 == null) {
            return;
        }
        var1.field3503.method5492(false);
        if (var1.field3501 != null) {
            class84 var3 = new class84();
            var3.method2150(var2);
            var3.method2148(var1.field3501);
            client.method6208().method6324(var3);
        }
    }

    @ObfuscatedName("he.af(II)Z")
    public boolean method455(int arg0) {
        if (this.field2340 == null) {
            return false;
        }
        class28 var2 = this.field2340.method5772();
        if (var2 == null) {
            return false;
        }
        if (var2.method406(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2337 = true;
                    break;
                case 82:
                    this.field2335 = true;
                    break;
                default:
                    if (this.method3869(arg0)) {
                        client.method3056(this.field2340);
                    }
            }
        }
        return var2.method404(arg0);
    }

    @ObfuscatedName("he.an(II)Z")
    public boolean method448(int arg0) {
        switch(arg0) {
            case 81:
                this.field2337 = false;
                return false;
            case 82:
                this.field2335 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("he.aw(CI)Z")
    public boolean method447(char arg0) {
        if (this.field2340 == null) {
            return false;
        } else if (class370.method707(arg0)) {
            class315 var2 = this.field2340.method5797();
            if (var2 == null || !var2.method5548()) {
                return false;
            }
            class28 var3 = this.field2340.method5772();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method434(arg0) && var2.method5509(arg0)) {
                    client.method3056(this.field2340);
                }
                return var3.method405(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("he.ac(ZB)Z")
    public boolean method450(boolean arg0) {
        return false;
    }

    @ObfuscatedName("he.ah(II)Z")
    public boolean method3869(int arg0) {
        if (this.field2340 == null) {
            return false;
        }
        class315 var2 = this.field2340.method5797();
        if (var2 == null || !var2.method5548()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method3863();
                return true;
            case 48:
                if (this.field2335) {
                    var2.method5757();
                }
                return true;
            case 65:
                if (this.field2335) {
                    var2.method5678(client.method3050());
                }
                return true;
            case 66:
                if (this.field2335) {
                    var2.method5533(client.method3050());
                }
                return true;
            case 67:
                if (this.field2335) {
                    var2.method5535(client.method3050());
                }
                return true;
            case 84:
                if (var2.method5554() == 0) {
                    var2.method5509(10);
                } else if (this.field2337 && var2.method5558()) {
                    var2.method5509(10);
                } else {
                    class313 var3 = this.field2340.method5800();
                    class84 var4 = new class84();
                    var4.method2150(this.field2340);
                    var4.method2148(var3.field3505);
                    client.method6208().method6324(var4);
                    this.method3863();
                }
                return true;
            case 85:
                if (this.field2335) {
                    var2.method5695();
                } else {
                    var2.method5612();
                }
                return true;
            case 96:
                if (this.field2335) {
                    var2.method5756(this.field2337);
                } else {
                    var2.method5521(this.field2337);
                }
                return true;
            case 97:
                if (this.field2335) {
                    var2.method5524(this.field2337);
                } else {
                    var2.method5522(this.field2337);
                }
                return true;
            case 98:
                if (this.field2335) {
                    var2.method5679();
                } else {
                    var2.method5525(this.field2337);
                }
                return true;
            case 99:
                if (this.field2335) {
                    var2.method5683();
                } else {
                    var2.method5526(this.field2337);
                }
                return true;
            case 101:
                if (this.field2335) {
                    var2.method5747();
                } else {
                    var2.method5572();
                }
                return true;
            case 102:
                if (this.field2335) {
                    var2.method5519(this.field2337);
                } else {
                    var2.method5513(this.field2337);
                }
                return true;
            case 103:
                if (this.field2335) {
                    var2.method5627(this.field2337);
                } else {
                    var2.method5622(this.field2337);
                }
                return true;
            case 104:
                if (this.field2335) {
                    var2.method5529(this.field2337);
                } else {
                    var2.method5527(this.field2337);
                }
                return true;
            case 105:
                if (this.field2335) {
                    var2.method5515(this.field2337);
                } else {
                    var2.method5512(this.field2337);
                }
                return true;
            default:
                return false;
        }
    }
}
