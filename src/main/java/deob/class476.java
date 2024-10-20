package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("sf")
public abstract class class476 {

    @ObfuscatedName("sf.au")
    public final int field4992;

    @ObfuscatedName("sf.ar")
    public int field4988 = 0;

    @ObfuscatedName("sf.al")
    public class474[] field4989;

    @ObfuscatedName("sf.ad")
    public HashMap field4990;

    @ObfuscatedName("sf.ah")
    public HashMap field4987;

    @ObfuscatedName("sf.ap")
    public Comparator field4991 = null;

    public class476(int arg0) {
        this.field4992 = arg0;
        this.field4989 = this.method7985(arg0);
        this.field4990 = new HashMap(arg0 / 8);
        this.field4987 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("sf.bx(I)V")
    public void method8086() {
        this.field4988 = 0;
        Arrays.fill(this.field4989, (Object) null);
        this.field4990.clear();
        this.field4987.clear();
    }

    @ObfuscatedName("sf.bf(I)I")
    public int method8109() {
        return this.field4988;
    }

    @ObfuscatedName("sf.bm(I)Z")
    public boolean method8088() {
        return this.field4992 == this.field4988;
    }

    @ObfuscatedName("sf.bs(Lwf;S)Z")
    public boolean method8154(class574 arg0) {
        if (arg0.method9639()) {
            return this.field4990.containsKey(arg0) ? true : this.field4987.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("sf.bw(Lwf;B)Lss;")
    public class474 method8090(class574 arg0) {
        class474 var2 = this.method8091(arg0);
        return var2 == null ? this.method8122(arg0) : var2;
    }

    @ObfuscatedName("sf.ba(Lwf;I)Lss;")
    public class474 method8091(class574 arg0) {
        return arg0.method9639() ? (class474) this.field4990.get(arg0) : null;
    }

    @ObfuscatedName("sf.bj(Lwf;I)Lss;")
    public class474 method8122(class574 arg0) {
        return arg0.method9639() ? (class474) this.field4987.get(arg0) : null;
    }

    @ObfuscatedName("sf.bp(Lwf;B)Z")
    public final boolean method8093(class574 arg0) {
        class474 var2 = this.method8091(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method8094(var2);
            return true;
        }
    }

    @ObfuscatedName("sf.by(Lss;B)V")
    public final void method8094(class474 arg0) {
        int var2 = this.method8096(arg0);
        if (var2 != -1) {
            this.method8103(var2);
            this.method8101(arg0);
        }
    }

    @ObfuscatedName("sf.bb(Lwf;B)Lss;")
    public class474 method8095(class574 arg0) {
        return this.method8145(arg0, (class574) null);
    }

    @ObfuscatedName("sf.bi(Lwf;Lwf;I)Lss;")
    public class474 method8145(class574 arg0, class574 arg1) {
        if (this.method8091(arg0) != null) {
            throw new IllegalStateException();
        }
        class474 var3 = this.method7986();
        var3.method8067(arg0, arg1);
        this.method8087(var3);
        this.method8102(var3);
        return var3;
    }

    @ObfuscatedName("sf.bg(II)Lss;")
    public final class474 method8097(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4988) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4989[arg0];
    }

    @ObfuscatedName("sf.bl(B)V")
    public final void method8098() {
        if (this.field4991 == null) {
            Arrays.sort(this.field4989, 0, this.field4988);
        } else {
            Arrays.sort(this.field4989, 0, this.field4988, this.field4991);
        }
    }

    @ObfuscatedName("sf.bz(Lss;Lwf;Lwf;I)V")
    public final void method8099(class474 arg0, class574 arg1, class574 arg2) {
        this.method8101(arg0);
        arg0.method8067(arg1, arg2);
        this.method8102(arg0);
    }

    @ObfuscatedName("sf.bu(Lss;I)I")
    public final int method8096(class474 arg0) {
        for (int var2 = 0; var2 < this.field4988; var2++) {
            if (this.field4989[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("sf.br(Lss;I)V")
    public final void method8101(class474 arg0) {
        if (this.field4990.remove(arg0.field4984) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4983 != null) {
            this.field4987.remove(arg0.field4983);
        }
    }

    @ObfuscatedName("sf.bo(Lss;B)V")
    public final void method8087(class474 arg0) {
        this.field4989[++this.field4988 - 1] = arg0;
    }

    @ObfuscatedName("sf.bv(Lss;I)V")
    public final void method8102(class474 arg0) {
        this.field4990.put(arg0.field4984, arg0);
        if (arg0.field4983 != null) {
            class474 var2 = (class474) this.field4987.put(arg0.field4983, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4983 = null;
            }
        }
    }

    @ObfuscatedName("sf.bt(II)V")
    public final void method8103(int arg0) {
        this.field4988--;
        if (arg0 < this.field4988) {
            System.arraycopy(this.field4989, arg0 + 1, this.field4989, arg0, this.field4988 - arg0);
        }
    }

    @ObfuscatedName("sf.bq(S)V")
    public final void method8105() {
        this.field4991 = null;
    }

    @ObfuscatedName("sf.bk(Ljava/util/Comparator;I)V")
    public final void method8107(Comparator arg0) {
        if (this.field4991 == null) {
            this.field4991 = arg0;
        } else if (this.field4991 instanceof class475) {
            ((class475) this.field4991).method8078(arg0);
        }
    }

    @ObfuscatedName("sf.ac(I)Lss;")
    public abstract class474 method7986();

    @ObfuscatedName("sf.ae(II)[Lss;")
    public abstract class474[] method7985(int arg0);
}
