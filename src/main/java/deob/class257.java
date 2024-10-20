package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("jf")
public class class257 {

    @ObfuscatedName("jf.au")
    public int field2914 = -1;

    @ObfuscatedName("jf.ae")
    public String field2906;

    @ObfuscatedName("jf.ao")
    public String field2908;

    @ObfuscatedName("jf.at")
    public int field2912 = -1;

    @ObfuscatedName("jf.ac")
    public int field2909 = -1;

    @ObfuscatedName("jf.ai")
    public class323 field2910 = null;

    @ObfuscatedName("jf.az")
    public int field2911 = Integer.MAX_VALUE;

    @ObfuscatedName("jf.ap")
    public int field2905 = 0;

    @ObfuscatedName("jf.aa")
    public int field2913 = Integer.MAX_VALUE;

    @ObfuscatedName("jf.af")
    public int field2907 = 0;

    @ObfuscatedName("jf.ad")
    public boolean field2915 = false;

    @ObfuscatedName("jf.aq")
    public LinkedList field2916;

    @ObfuscatedName("jf.au(Ltm;IB)V")
    public void method4731(class515 arg0, int arg1) {
        this.field2914 = arg1;
        this.field2906 = arg0.method8311();
        this.field2908 = arg0.method8311();
        this.field2910 = new class323(arg0.method8306());
        this.field2912 = arg0.method8306();
        arg0.method8300();
        this.field2915 = arg0.method8300() == 1;
        this.field2909 = arg0.method8300();
        int var3 = arg0.method8300();
        this.field2916 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2916.add(this.method4768(arg0));
        }
        this.method4730();
    }

    @ObfuscatedName("jf.ae(Ltm;I)Lkw;")
    public class277 method4768(class515 arg0) {
        int var2 = arg0.method8300();
        class265[] var3 = new class265[] { class265.field2991, class265.field2994, class265.field2993, class265.field2999 };
        class265 var4 = (class265) class373.method371(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field2995) {
            case 0:
                var6 = new class261();
                break;
            case 1:
                var6 = new class264();
                break;
            case 2:
                var6 = new class256();
                break;
            case 3:
                var6 = new class274();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class277) var6).method4716(arg0);
        return (class277) var6;
    }

    @ObfuscatedName("jf.ao(IIII)Z")
    public boolean method4732(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2916.iterator();
        class277 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class277) var4.next();
        } while (!var5.method4714(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("jf.at(III)Z")
    public boolean method4739(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2911 || var3 > this.field2905) {
            return false;
        } else if (var4 >= this.field2913 && var4 <= this.field2907) {
            Iterator var5 = this.field2916.iterator();
            class277 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class277) var5.next();
            } while (!var6.method4713(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jf.ac(IIII)[I")
    public int[] method4762(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2916.iterator();
        class277 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class277) var4.next();
        } while (!var5.method4714(arg0, arg1, arg2));
        return var5.method4718(arg0, arg1, arg2);
    }

    @ObfuscatedName("jf.ai(III)Lmc;")
    public class323 method4736(int arg0, int arg1) {
        Iterator var3 = this.field2916.iterator();
        class277 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class277) var3.next();
        } while (!var4.method4713(arg0, arg1));
        return var4.method4715(arg0, arg1);
    }

    @ObfuscatedName("jf.az(I)V")
    public void method4730() {
        Iterator var1 = this.field2916.iterator();
        while (var1.hasNext()) {
            class277 var2 = (class277) var1.next();
            var2.method4712(this);
        }
    }

    @ObfuscatedName("jf.ap(I)I")
    public int method4747() {
        return this.field2914;
    }

    @ObfuscatedName("jf.aa(I)Z")
    public boolean method4738() {
        return this.field2915;
    }

    @ObfuscatedName("jf.af(B)Ljava/lang/String;")
    public String method4746() {
        return this.field2906;
    }

    @ObfuscatedName("jf.ad(I)Ljava/lang/String;")
    public String method4740() {
        return this.field2908;
    }

    @ObfuscatedName("jf.aq(I)I")
    public int method4741() {
        return this.field2912;
    }

    @ObfuscatedName("jf.al(B)I")
    public int method4742() {
        return this.field2909;
    }

    @ObfuscatedName("jf.an(I)I")
    public int method4743() {
        return this.field2911;
    }

    @ObfuscatedName("jf.ar(B)I")
    public int method4790() {
        return this.field2905;
    }

    @ObfuscatedName("jf.ab(B)I")
    public int method4776() {
        return this.field2913;
    }

    @ObfuscatedName("jf.ag(I)I")
    public int method4763() {
        return this.field2907;
    }

    @ObfuscatedName("jf.am(I)I")
    public int method4784() {
        return this.field2910.field3543;
    }

    @ObfuscatedName("jf.ax(B)I")
    public int method4748() {
        return this.field2910.field3544;
    }

    @ObfuscatedName("jf.ah(B)I")
    public int method4749() {
        return this.field2910.field3545;
    }

    @ObfuscatedName("jf.as(I)Lmc;")
    public class323 method4752() {
        return new class323(this.field2910);
    }
}
