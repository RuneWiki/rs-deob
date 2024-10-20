package deob;

@ObfuscatedName("km")
public class class268 implements class30 {

    @ObfuscatedName("km.ap")
    public class362 field2975 = null;

    @ObfuscatedName("km.aw")
    public boolean field2974 = false;

    @ObfuscatedName("km.ak")
    public boolean field2976 = false;

    @ObfuscatedName("km.af(Lng;I)V")
    public void method5224(class362 arg0) {
        if (arg0 == null) {
            this.method5225();
            return;
        }
        if (this.field2975 != arg0) {
            this.method5225();
            this.field2975 = arg0;
        }
        class358 var2 = arg0.method6690();
        if (var2 == null) {
            return;
        }
        if (!var2.field3816.method6463() && var2.field3813 != null) {
            class91 var3 = new class91();
            var3.method2478(arg0);
            var3.method2476(var2.field3813);
            client.method6980().method7243(var3);
        }
        var2.field3816.method6618(true);
    }

    @ObfuscatedName("km.ar(I)Lng;")
    public class362 method5230() {
        return this.field2975;
    }

    @ObfuscatedName("km.ab(I)V")
    public void method5225() {
        if (this.field2975 == null) {
            return;
        }
        class358 var1 = this.field2975.method6690();
        class362 var2 = this.field2975;
        this.field2975 = null;
        if (var1 == null) {
            return;
        }
        if (var1.field3816.method6463() && var1.field3813 != null) {
            class91 var3 = new class91();
            var3.method2478(var2);
            var3.method2476(var1.field3813);
            client.method6980().method7243(var3);
        }
        var1.field3816.method6618(false);
    }

    @ObfuscatedName("km.ap(IB)Z")
    public boolean method445(int arg0) {
        if (this.field2975 == null) {
            return false;
        }
        class28 var2 = this.field2975.method6729();
        if (var2 == null) {
            return false;
        }
        if (var2.method424(arg0)) {
            switch(arg0) {
                case 81:
                    this.field2976 = true;
                    break;
                case 82:
                    this.field2974 = true;
                    break;
                default:
                    if (this.method5227(arg0)) {
                        client.method2944(this.field2975);
                    }
            }
        }
        return var2.method394(arg0);
    }

    @ObfuscatedName("km.aw(IB)Z")
    public boolean method450(int arg0) {
        switch(arg0) {
            case 81:
                this.field2976 = false;
                return false;
            case 82:
                this.field2974 = false;
                return false;
            default:
                return false;
        }
    }

    @ObfuscatedName("km.ak(CI)Z")
    public boolean method447(char arg0) {
        if (this.field2975 == null) {
            return false;
        } else if (class418.method6904(arg0)) {
            class360 var2 = this.field2975.method6707();
            if (var2 == null || !var2.method6468()) {
                return false;
            }
            class28 var3 = this.field2975.method6729();
            if (var3 == null) {
                return false;
            } else {
                if (var3.method396(arg0) && var2.method6541(arg0)) {
                    client.method2944(this.field2975);
                }
                return var3.method391(arg0);
            }
        } else {
            return false;
        }
    }

    @ObfuscatedName("km.aj(ZB)Z")
    public boolean method442(boolean arg0) {
        return false;
    }

    @ObfuscatedName("km.az(IB)Z")
    public boolean method5227(int arg0) {
        if (this.field2975 == null) {
            return false;
        }
        class360 var2 = this.field2975.method6707();
        if (var2 == null || !var2.method6468()) {
            return false;
        }
        switch(arg0) {
            case 13:
                this.method5225();
                return true;
            case 48:
                if (this.field2974) {
                    var2.method6436();
                }
                return true;
            case 65:
                if (this.field2974) {
                    var2.method6454(client.method5972());
                }
                return true;
            case 66:
                if (this.field2974) {
                    var2.method6559(client.method5972());
                }
                return true;
            case 67:
                if (this.field2974) {
                    var2.method6455(client.method5972());
                }
                return true;
            case 84:
                if (var2.method6474() == 0) {
                    var2.method6541(10);
                } else if (this.field2976 && var2.method6478()) {
                    var2.method6541(10);
                } else {
                    class358 var3 = this.field2975.method6690();
                    class91 var4 = new class91();
                    var4.method2478(this.field2975);
                    var4.method2476(var3.field3815);
                    client.method6980().method7243(var4);
                    this.method5225();
                }
                return true;
            case 85:
                if (this.field2974) {
                    var2.method6599();
                } else {
                    var2.method6431();
                }
                return true;
            case 96:
                if (this.field2974) {
                    var2.method6444(this.field2976);
                } else {
                    var2.method6442(this.field2976);
                }
                return true;
            case 97:
                if (this.field2974) {
                    var2.method6445(this.field2976);
                } else {
                    var2.method6486(this.field2976);
                }
                return true;
            case 98:
                if (this.field2974) {
                    var2.method6456();
                } else {
                    var2.method6446(this.field2976);
                }
                return true;
            case 99:
                if (this.field2974) {
                    var2.method6626();
                } else {
                    var2.method6531(this.field2976);
                }
                return true;
            case 101:
                if (this.field2974) {
                    var2.method6434();
                } else {
                    var2.method6566();
                }
                return true;
            case 102:
                if (this.field2974) {
                    var2.method6411(this.field2976);
                } else {
                    var2.method6438(this.field2976);
                }
                return true;
            case 103:
                if (this.field2974) {
                    var2.method6627(this.field2976);
                } else {
                    var2.method6423(this.field2976);
                }
                return true;
            case 104:
                if (this.field2974) {
                    var2.method6450(this.field2976);
                } else {
                    var2.method6554(this.field2976);
                }
                return true;
            case 105:
                if (this.field2974) {
                    var2.method6451(this.field2976);
                } else {
                    var2.method6449(this.field2976);
                }
                return true;
            default:
                return false;
        }
    }
}
