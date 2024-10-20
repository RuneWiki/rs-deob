package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("js")
public class class258 {

    @ObfuscatedName("js.aw")
    public int field2886 = -1;

    @ObfuscatedName("js.ay")
    public String field2891;

    @ObfuscatedName("js.ar")
    public String field2888;

    @ObfuscatedName("js.am")
    public int field2895 = -1;

    @ObfuscatedName("js.as")
    public int field2890 = -1;

    @ObfuscatedName("js.aj")
    public class324 field2887 = null;

    @ObfuscatedName("js.ag")
    public int field2892 = Integer.MAX_VALUE;

    @ObfuscatedName("js.az")
    public int field2893 = 0;

    @ObfuscatedName("js.av")
    public int field2889 = Integer.MAX_VALUE;

    @ObfuscatedName("js.ap")
    public int field2894 = 0;

    @ObfuscatedName("js.aq")
    public boolean field2896 = false;

    @ObfuscatedName("js.at")
    public LinkedList field2897;

    @ObfuscatedName("js.aw(Lty;II)V")
    public void method4747(class514 arg0, int arg1) {
        this.field2886 = arg1;
        this.field2891 = arg0.method8369();
        this.field2888 = arg0.method8369();
        this.field2887 = new class324(arg0.method8496());
        this.field2895 = arg0.method8496();
        arg0.method8244();
        this.field2896 = arg0.method8244() == 1;
        this.field2890 = arg0.method8244();
        int var3 = arg0.method8244();
        this.field2897 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2897.add(this.method4721(arg0));
        }
        this.method4726();
    }

    @ObfuscatedName("js.ay(Lty;I)Lkz;")
    public class278 method4721(class514 arg0) {
        int var2 = arg0.method8244();
        class266[] var3 = new class266[] { class266.field2975, class266.field2973, class266.field2972, class266.field2974 };
        class266 var4 = (class266) class374.method2465(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field2978) {
            case 0:
                var6 = new class275();
                break;
            case 1:
                var6 = new class257();
                break;
            case 2:
                var6 = new class262();
                break;
            case 3:
                var6 = new class265();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class278) var6).method4698(arg0);
        return (class278) var6;
    }

    @ObfuscatedName("js.ar(IIII)Z")
    public boolean method4790(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2897.iterator();
        class278 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class278) var4.next();
        } while (!var5.method4697(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("js.am(III)Z")
    public boolean method4723(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2892 || var3 > this.field2893) {
            return false;
        } else if (var4 >= this.field2889 && var4 <= this.field2894) {
            Iterator var5 = this.field2897.iterator();
            class278 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class278) var5.next();
            } while (!var6.method4709(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("js.as(IIIB)[I")
    public int[] method4724(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2897.iterator();
        class278 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class278) var4.next();
        } while (!var5.method4697(arg0, arg1, arg2));
        return var5.method4715(arg0, arg1, arg2);
    }

    @ObfuscatedName("js.aj(III)Lmr;")
    public class324 method4725(int arg0, int arg1) {
        Iterator var3 = this.field2897.iterator();
        class278 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class278) var3.next();
        } while (!var4.method4709(arg0, arg1));
        return var4.method4699(arg0, arg1);
    }

    @ObfuscatedName("js.ag(I)V")
    public void method4726() {
        Iterator var1 = this.field2897.iterator();
        while (var1.hasNext()) {
            class278 var2 = (class278) var1.next();
            var2.method4695(this);
        }
    }

    @ObfuscatedName("js.az(B)I")
    public int method4727() {
        return this.field2886;
    }

    @ObfuscatedName("js.av(B)Z")
    public boolean method4728() {
        return this.field2896;
    }

    @ObfuscatedName("js.ap(I)Ljava/lang/String;")
    public String method4729() {
        return this.field2891;
    }

    @ObfuscatedName("js.aq(B)Ljava/lang/String;")
    public String method4737() {
        return this.field2888;
    }

    @ObfuscatedName("js.at(B)I")
    public int method4731() {
        return this.field2895;
    }

    @ObfuscatedName("js.ah(B)I")
    public int method4732() {
        return this.field2890;
    }

    @ObfuscatedName("js.ax(B)I")
    public int method4766() {
        return this.field2892;
    }

    @ObfuscatedName("js.aa(I)I")
    public int method4734() {
        return this.field2893;
    }

    @ObfuscatedName("js.au(I)I")
    public int method4735() {
        return this.field2889;
    }

    @ObfuscatedName("js.ae(I)I")
    public int method4736() {
        return this.field2894;
    }

    @ObfuscatedName("js.ab(I)I")
    public int method4719() {
        return this.field2887.field3536;
    }

    @ObfuscatedName("js.ad(B)I")
    public int method4738() {
        return this.field2887.field3537;
    }

    @ObfuscatedName("js.ao(B)I")
    public int method4739() {
        return this.field2887.field3538;
    }

    @ObfuscatedName("js.ac(B)Lmr;")
    public class324 method4740() {
        return new class324(this.field2887);
    }
}
