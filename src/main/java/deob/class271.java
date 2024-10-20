package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("kz")
public class class271 {

    @ObfuscatedName("kz.ac")
    public int field2933 = -1;

    @ObfuscatedName("kz.al")
    public String field2932;

    @ObfuscatedName("kz.ak")
    public String field2940;

    @ObfuscatedName("kz.ax")
    public int field2934 = -1;

    @ObfuscatedName("kz.ao")
    public int field2935 = -16777216;

    @ObfuscatedName("kz.ah")
    public int field2939 = -1;

    @ObfuscatedName("kz.ar")
    public class337 field2937 = null;

    @ObfuscatedName("kz.ab")
    public int field2936 = Integer.MAX_VALUE;

    @ObfuscatedName("kz.am")
    public int field2938 = 0;

    @ObfuscatedName("kz.av")
    public int field2944 = Integer.MAX_VALUE;

    @ObfuscatedName("kz.ag")
    public int field2941 = 0;

    @ObfuscatedName("kz.aa")
    public boolean field2942 = false;

    @ObfuscatedName("kz.ap")
    public LinkedList field2943;

    @ObfuscatedName("kz.ac(Lul;IZI)V")
    public void method4851(class530 arg0, int arg1, boolean arg2) {
        this.field2933 = arg1;
        this.field2932 = arg0.method8588();
        this.field2940 = arg0.method8588();
        this.field2937 = new class337(arg0.method8371());
        this.field2934 = arg0.method8371();
        if (arg2) {
            this.field2935 = arg0.method8371();
        }
        arg0.method8365();
        this.field2942 = arg0.method8365() == 1;
        this.field2939 = arg0.method8365();
        int var4 = arg0.method8365();
        this.field2943 = new LinkedList();
        for (int var5 = 0; var5 < var4; var5++) {
            this.field2943.add(this.method4852(arg0));
        }
        this.method4886();
    }

    @ObfuscatedName("kz.al(Lul;I)Llm;")
    public class291 method4852(class530 arg0) {
        int var2 = arg0.method8365();
        class279[] var3 = new class279[] { class279.field3017, class279.field3018, class279.field3019, class279.field3016 };
        class279 var4 = (class279) class388.method3894(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field3022) {
            case 0:
                var6 = new class270();
                break;
            case 1:
                var6 = new class278();
                break;
            case 2:
                var6 = new class288();
                break;
            case 3:
                var6 = new class275();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class291) var6).method4844(arg0);
        return (class291) var6;
    }

    @ObfuscatedName("kz.ak(IIIS)Z")
    public boolean method4893(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2943.iterator();
        class291 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class291) var4.next();
        } while (!var5.method4848(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("kz.ax(III)Z")
    public boolean method4874(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2936 || var3 > this.field2938) {
            return false;
        } else if (var4 >= this.field2944 && var4 <= this.field2941) {
            Iterator var5 = this.field2943.iterator();
            class291 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class291) var5.next();
            } while (!var6.method4825(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kz.ao(IIII)[I")
    public int[] method4854(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2943.iterator();
        class291 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class291) var4.next();
        } while (!var5.method4848(arg0, arg1, arg2));
        return var5.method4843(arg0, arg1, arg2);
    }

    @ObfuscatedName("kz.ah(III)Lmo;")
    public class337 method4894(int arg0, int arg1) {
        Iterator var3 = this.field2943.iterator();
        class291 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class291) var3.next();
        } while (!var4.method4825(arg0, arg1));
        return var4.method4827(arg0, arg1);
    }

    @ObfuscatedName("kz.ar(I)V")
    public void method4886() {
        Iterator var1 = this.field2943.iterator();
        while (var1.hasNext()) {
            class291 var2 = (class291) var1.next();
            var2.method4823(this);
        }
    }

    @ObfuscatedName("kz.ab(S)I")
    public int method4857() {
        return this.field2933;
    }

    @ObfuscatedName("kz.am(B)Z")
    public boolean method4858() {
        return this.field2942;
    }

    @ObfuscatedName("kz.av(B)Ljava/lang/String;")
    public String method4859() {
        return this.field2932;
    }

    @ObfuscatedName("kz.ag(I)Ljava/lang/String;")
    public String method4860() {
        return this.field2940;
    }

    @ObfuscatedName("kz.aa(I)I")
    public int method4902() {
        return this.field2934;
    }

    @ObfuscatedName("kz.ap(I)I")
    public int method4862() {
        return this.field2935;
    }

    @ObfuscatedName("kz.ay(I)I")
    public int method4863() {
        return this.field2939;
    }

    @ObfuscatedName("kz.as(B)I")
    public int method4864() {
        return this.field2936;
    }

    @ObfuscatedName("kz.aj(B)I")
    public int method4872() {
        return this.field2938;
    }

    @ObfuscatedName("kz.an(B)I")
    public int method4866() {
        return this.field2944;
    }

    @ObfuscatedName("kz.au(B)I")
    public int method4918() {
        return this.field2941;
    }

    @ObfuscatedName("kz.ai(I)I")
    public int method4868() {
        return this.field2937.field3578;
    }

    @ObfuscatedName("kz.ae(B)I")
    public int method4869() {
        return this.field2937.field3575;
    }

    @ObfuscatedName("kz.aw(B)I")
    public int method4870() {
        return this.field2937.field3574;
    }

    @ObfuscatedName("kz.aq(I)Lmo;")
    public class337 method4878() {
        return new class337(this.field2937);
    }
}
