package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("kz")
public class class281 {

    @ObfuscatedName("kz.ak")
    public int field3079 = -1;

    @ObfuscatedName("kz.al")
    public String field3080;

    @ObfuscatedName("kz.aj")
    public String field3072;

    @ObfuscatedName("kz.az")
    public int field3070 = -1;

    @ObfuscatedName("kz.af")
    public int field3074 = -16777216;

    @ObfuscatedName("kz.aa")
    public int field3075 = -1;

    @ObfuscatedName("kz.at")
    public class347 field3073 = null;

    @ObfuscatedName("kz.ab")
    public int field3077 = Integer.MAX_VALUE;

    @ObfuscatedName("kz.ac")
    public int field3078 = 0;

    @ObfuscatedName("kz.ao")
    public int field3076 = Integer.MAX_VALUE;

    @ObfuscatedName("kz.ah")
    public int field3071 = 0;

    @ObfuscatedName("kz.av")
    public boolean field3081 = false;

    @ObfuscatedName("kz.aq")
    public LinkedList field3082;

    @ObfuscatedName("kz.ak(Lua;IB)V")
    public void method5165(class546 arg0, int arg1) {
        this.field3079 = arg1;
        this.field3080 = arg0.method8806();
        this.field3072 = arg0.method8806();
        this.field3073 = new class347(arg0.method8801());
        this.field3070 = arg0.method8801();
        this.field3074 = arg0.method8801();
        arg0.method8796();
        this.field3081 = arg0.method8796() == 1;
        this.field3075 = arg0.method8796();
        int var3 = arg0.method8796();
        this.field3082 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3082.add(this.method5116(arg0));
        }
        this.method5121();
    }

    @ObfuscatedName("kz.al(Lua;I)Lll;")
    public class301 method5116(class546 arg0) {
        int var2 = arg0.method8796();
        class289[] var3 = new class289[] { class289.field3169, class289.field3165, class289.field3167, class289.field3166 };
        class289 var4 = (class289) class401.method2027(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field3164) {
            case 0:
                var6 = new class298();
                break;
            case 1:
                var6 = new class288();
                break;
            case 2:
                var6 = new class285();
                break;
            case 3:
                var6 = new class280();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class301) var6).method5085(arg0);
        return (class301) var6;
    }

    @ObfuscatedName("kz.aj(IIII)Z")
    public boolean method5173(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3082.iterator();
        class301 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class301) var4.next();
        } while (!var5.method5097(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("kz.az(III)Z")
    public boolean method5127(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field3077 || var3 > this.field3078) {
            return false;
        } else if (var4 >= this.field3076 && var4 <= this.field3071) {
            Iterator var5 = this.field3082.iterator();
            class301 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class301) var5.next();
            } while (!var6.method5082(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kz.af(IIII)[I")
    public int[] method5119(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3082.iterator();
        class301 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class301) var4.next();
        } while (!var5.method5097(arg0, arg1, arg2));
        return var5.method5084(arg0, arg1, arg2);
    }

    @ObfuscatedName("kz.aa(IIB)Lnj;")
    public class347 method5172(int arg0, int arg1) {
        Iterator var3 = this.field3082.iterator();
        class301 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class301) var3.next();
        } while (!var4.method5082(arg0, arg1));
        return var4.method5087(arg0, arg1);
    }

    @ObfuscatedName("kz.at(B)V")
    public void method5121() {
        Iterator var1 = this.field3082.iterator();
        while (var1.hasNext()) {
            class301 var2 = (class301) var1.next();
            var2.method5109(this);
        }
    }

    @ObfuscatedName("kz.ab(B)I")
    public int method5122() {
        return this.field3079;
    }

    @ObfuscatedName("kz.ac(B)Z")
    public boolean method5123() {
        return this.field3081;
    }

    @ObfuscatedName("kz.ao(B)Ljava/lang/String;")
    public String method5124() {
        return this.field3080;
    }

    @ObfuscatedName("kz.ah(I)Ljava/lang/String;")
    public String method5132() {
        return this.field3072;
    }

    @ObfuscatedName("kz.av(I)I")
    public int method5126() {
        return this.field3070;
    }

    @ObfuscatedName("kz.aq(I)I")
    public int method5117() {
        return this.field3074;
    }

    @ObfuscatedName("kz.ap(I)I")
    public int method5128() {
        return this.field3075;
    }

    @ObfuscatedName("kz.ae(B)I")
    public int method5129() {
        return this.field3077;
    }

    @ObfuscatedName("kz.ax(B)I")
    public int method5130() {
        return this.field3078;
    }

    @ObfuscatedName("kz.ay(I)I")
    public int method5131() {
        return this.field3076;
    }

    @ObfuscatedName("kz.au(B)I")
    public int method5154() {
        return this.field3071;
    }

    @ObfuscatedName("kz.as(B)I")
    public int method5145() {
        return this.field3073.field3714;
    }

    @ObfuscatedName("kz.aw(B)I")
    public int method5134() {
        return this.field3073.field3715;
    }

    @ObfuscatedName("kz.ad(I)I")
    public int method5135() {
        return this.field3073.field3713;
    }

    @ObfuscatedName("kz.ai(I)Lnj;")
    public class347 method5136() {
        return new class347(this.field3073);
    }
}
