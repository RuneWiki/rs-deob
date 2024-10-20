package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ji")
public class class256 {

    @ObfuscatedName("ji.at")
    public int field2893 = -1;

    @ObfuscatedName("ji.an")
    public String field2888;

    @ObfuscatedName("ji.av")
    public String field2889;

    @ObfuscatedName("ji.as")
    public int field2895 = -1;

    @ObfuscatedName("ji.ax")
    public int field2891 = -1;

    @ObfuscatedName("ji.ap")
    public class321 field2892 = null;

    @ObfuscatedName("ji.ab")
    public int field2890 = Integer.MAX_VALUE;

    @ObfuscatedName("ji.ak")
    public int field2894 = 0;

    @ObfuscatedName("ji.ae")
    public int field2887 = Integer.MAX_VALUE;

    @ObfuscatedName("ji.af")
    public int field2896 = 0;

    @ObfuscatedName("ji.ao")
    public boolean field2897 = false;

    @ObfuscatedName("ji.aa")
    public LinkedList field2898;

    @ObfuscatedName("ji.at(Ltz;IB)V")
    public void method4718(class501 arg0, int arg1) {
        this.field2893 = arg1;
        this.field2888 = arg0.method8253();
        this.field2889 = arg0.method8253();
        this.field2892 = new class321(arg0.method8134());
        this.field2895 = arg0.method8134();
        arg0.method8129();
        this.field2897 = arg0.method8129() == 1;
        this.field2891 = arg0.method8129();
        int var3 = arg0.method8129();
        this.field2898 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2898.add(this.method4695(arg0));
        }
        this.method4700();
    }

    @ObfuscatedName("ji.an(Ltz;I)Lkg;")
    public class276 method4695(class501 arg0) {
        int var2 = arg0.method8129();
        class264[] var3 = new class264[] { class264.field2971, class264.field2970, class264.field2972, class264.field2975 };
        class264 var4 = (class264) class371.method4632(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field2973) {
            case 0:
                var6 = new class255();
                break;
            case 1:
                var6 = new class260();
                break;
            case 2:
                var6 = new class273();
                break;
            case 3:
                var6 = new class263();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class276) var6).method4670(arg0);
        return (class276) var6;
    }

    @ObfuscatedName("ji.av(IIIS)Z")
    public boolean method4724(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2898.iterator();
        class276 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class276) var4.next();
        } while (!var5.method4682(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ji.as(III)Z")
    public boolean method4697(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field2890 || var3 > this.field2894) {
            return false;
        } else if (var4 >= this.field2887 && var4 <= this.field2896) {
            Iterator var5 = this.field2898.iterator();
            class276 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class276) var5.next();
            } while (!var6.method4681(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ji.ax(IIII)[I")
    public int[] method4698(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field2898.iterator();
        class276 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class276) var4.next();
        } while (!var5.method4682(arg0, arg1, arg2));
        return var5.method4673(arg0, arg1, arg2);
    }

    @ObfuscatedName("ji.ap(III)Lmg;")
    public class321 method4699(int arg0, int arg1) {
        Iterator var3 = this.field2898.iterator();
        class276 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class276) var3.next();
        } while (!var4.method4681(arg0, arg1));
        return var4.method4674(arg0, arg1);
    }

    @ObfuscatedName("ji.ab(I)V")
    public void method4700() {
        Iterator var1 = this.field2898.iterator();
        while (var1.hasNext()) {
            class276 var2 = (class276) var1.next();
            var2.method4691(this);
        }
    }

    @ObfuscatedName("ji.ak(B)I")
    public int method4709() {
        return this.field2893;
    }

    @ObfuscatedName("ji.ae(B)Z")
    public boolean method4712() {
        return this.field2897;
    }

    @ObfuscatedName("ji.af(B)Ljava/lang/String;")
    public String method4703() {
        return this.field2888;
    }

    @ObfuscatedName("ji.ao(B)Ljava/lang/String;")
    public String method4704() {
        return this.field2889;
    }

    @ObfuscatedName("ji.aa(B)I")
    public int method4705() {
        return this.field2895;
    }

    @ObfuscatedName("ji.aj(I)I")
    public int method4748() {
        return this.field2891;
    }

    @ObfuscatedName("ji.ad(I)I")
    public int method4707() {
        return this.field2890;
    }

    @ObfuscatedName("ji.ac(I)I")
    public int method4708() {
        return this.field2894;
    }

    @ObfuscatedName("ji.ag(I)I")
    public int method4706() {
        return this.field2887;
    }

    @ObfuscatedName("ji.ar(I)I")
    public int method4721() {
        return this.field2896;
    }

    @ObfuscatedName("ji.ah(B)I")
    public int method4757() {
        return this.field2892.field3517;
    }

    @ObfuscatedName("ji.az(I)I")
    public int method4739() {
        return this.field2892.field3516;
    }

    @ObfuscatedName("ji.au(I)I")
    public int method4716() {
        return this.field2892.field3515;
    }

    @ObfuscatedName("ji.ai(I)Lmg;")
    public class321 method4714() {
        return new class321(this.field2892);
    }
}
