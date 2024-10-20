package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("kf")
public class class273 {

    @ObfuscatedName("kf.az")
    public int field3001 = -1;

    @ObfuscatedName("kf.ah")
    public String field2990;

    @ObfuscatedName("kf.af")
    public String field2991;

    @ObfuscatedName("kf.at")
    public int field2995 = -1;

    @ObfuscatedName("kf.an")
    public int field2993 = -16777216;

    @ObfuscatedName("kf.ao")
    public int field2997 = -1;

    @ObfuscatedName("kf.ab")
    public class339 field2989 = null;

    @ObfuscatedName("kf.aw")
    public int field2996 = Integer.MAX_VALUE;

    @ObfuscatedName("kf.ad")
    public int field3002 = 0;

    @ObfuscatedName("kf.al")
    public int field2998 = Integer.MAX_VALUE;

    @ObfuscatedName("kf.as")
    public int field2999 = 0;

    @ObfuscatedName("kf.ag")
    public boolean field3000 = false;

    @ObfuscatedName("kf.ai")
    public LinkedList field2994;

    @ObfuscatedName("kf.az(Lur;II)V")
    public void method4882(class535 arg0, int arg1) {
        this.field3001 = arg1;
        this.field2990 = arg0.method8473();
        this.field2991 = arg0.method8473();
        this.field2989 = new class339(arg0.method8682());
        this.field2995 = arg0.method8682();
        this.field2993 = arg0.method8682();
        arg0.method8462();
        this.field3000 = arg0.method8462() == 1;
        this.field2997 = arg0.method8462();
        int var3 = arg0.method8462();
        this.field2994 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2994.add(this.method4887(arg0));
        }
        this.method4891();
    }

    @ObfuscatedName("kf.ah(Lur;B)Llg;")
    public class293 method4887(class535 arg0) {
        int var2 = arg0.method8462();
        class281 var3 = (class281) class393.method3484(class281.method5169(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field3085) {
            case 0:
                var5 = new class277();
                break;
            case 1:
                var5 = new class290();
                break;
            case 2:
                var5 = new class280();
                break;
            case 3:
                var5 = new class272();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class293) var5).method4872(arg0);
        return (class293) var5;
    }

    @ObfuscatedName("kf.af(IIIB)Z")
    public boolean method4928(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2994.iterator();
        class293 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class293) var4.next();
        } while (!var5.method4857(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("kf.at(IIS)Z")
    public boolean method4886(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2996 || var3 > this.field3002) {
            return false;
        } else if (var4 >= this.field2998 && var4 <= this.field2999) {
            Iterator var5 = this.field2994.iterator();
            class293 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class293) var5.next();
            } while (!var6.method4870(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kf.an(IIIB)[I")
    public int[] method4946(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2994.iterator();
        class293 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class293) var4.next();
        } while (!var5.method4857(arg0, arg1, arg2));
        return var5.method4859(arg0, arg1, arg2);
    }

    @ObfuscatedName("kf.ao(III)Lnn;")
    public class339 method4888(int arg0, int arg1) {
        Iterator var3 = this.field2994.iterator();
        class293 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class293) var3.next();
        } while (!var4.method4870(arg0, arg1));
        return var4.method4860(arg0, arg1);
    }

    @ObfuscatedName("kf.ab(I)V")
    public void method4891() {
        Iterator var1 = this.field2994.iterator();
        while (var1.hasNext()) {
            class293 var2 = (class293) var1.next();
            var2.method4856(this);
        }
    }

    @ObfuscatedName("kf.aw(I)I")
    public int method4941() {
        return this.field3001;
    }

    @ObfuscatedName("kf.ad(I)Z")
    public boolean method4885() {
        return this.field3000;
    }

    @ObfuscatedName("kf.al(I)Ljava/lang/String;")
    public String method4904() {
        return this.field2990;
    }

    @ObfuscatedName("kf.as(I)Ljava/lang/String;")
    public String method4893() {
        return this.field2991;
    }

    @ObfuscatedName("kf.ag(B)I")
    public int method4894() {
        return this.field2995;
    }

    @ObfuscatedName("kf.ai(I)I")
    public int method4924() {
        return this.field2993;
    }

    @ObfuscatedName("kf.ax(I)I")
    public int method4896() {
        return this.field2997;
    }

    @ObfuscatedName("kf.ar(B)I")
    public int method4897() {
        return this.field2996;
    }

    @ObfuscatedName("kf.aj(I)I")
    public int method4898() {
        return this.field3002;
    }

    @ObfuscatedName("kf.au(I)I")
    public int method4899() {
        return this.field2998;
    }

    @ObfuscatedName("kf.ay(B)I")
    public int method4956() {
        return this.field2999;
    }

    @ObfuscatedName("kf.ap(I)I")
    public int method4889() {
        return this.field2989.field3638;
    }

    @ObfuscatedName("kf.av(I)I")
    public int method4952() {
        return this.field2989.field3637;
    }

    @ObfuscatedName("kf.aa(I)I")
    public int method4900() {
        return this.field2989.field3640;
    }

    @ObfuscatedName("kf.aq(I)Lnn;")
    public class339 method4903() {
        return new class339(this.field2989);
    }
}
