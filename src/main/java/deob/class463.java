package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("rz")
public final class class463 {

    @ObfuscatedName("rz.ab")
    public final Comparator field4883;

    @ObfuscatedName("rz.ay")
    public final Map field4881;

    @ObfuscatedName("rz.an")
    public final class432 field4882;

    @ObfuscatedName("rz.au")
    public final class432 field4884;

    @ObfuscatedName("rz.ax")
    public final long field4886;

    @ObfuscatedName("rz.ao")
    public final class461 field4885;

    @ObfuscatedName("rz.am")
    public final int field4880;

    public class463(int arg0, class461 arg1) {
        this(-1L, arg0, arg1);
    }

    public class463(long arg0, int arg1, class461 arg2) {
        this.field4883 = new class462(this);
        this.field4886 = arg0;
        this.field4880 = arg1;
        this.field4885 = arg2;
        if (this.field4880 == -1) {
            this.field4881 = new HashMap(64);
            this.field4882 = new class432(64, this.field4883);
            this.field4884 = null;
        } else if (this.field4885 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4881 = new HashMap(this.field4880);
            this.field4882 = new class432(this.field4880, this.field4883);
            this.field4884 = new class432(this.field4880);
        }
    }

    @ObfuscatedName("rz.ab(I)Z")
    public boolean method7836() {
        return this.field4880 != -1;
    }

    @ObfuscatedName("rz.ay(Ljava/lang/Object;S)Ljava/lang/Object;")
    public Object method7840(Object arg0) {
        synchronized (this) {
            if (this.field4886 != -1L) {
                this.method7846();
            }
            class464 var3 = (class464) this.field4881.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7839(var3, false);
                return var3.field4890;
            }
        }
    }

    @ObfuscatedName("rz.an(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7838(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4886 != -1L) {
                this.method7846();
            }
            class464 var4 = (class464) this.field4881.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4890;
                var4.field4890 = arg1;
                this.method7839(var4, false);
                return var5;
            }
            if (this.method7836() && this.field4881.size() == this.field4880) {
                class464 var6 = (class464) this.field4884.remove();
                this.field4881.remove(var6.field4888);
                this.field4882.remove(var6);
            }
            class464 var7 = new class464(arg1, arg0);
            this.field4881.put(arg0, var7);
            this.method7839(var7, true);
            return null;
        }
    }

    @ObfuscatedName("rz.au(Lrc;ZB)V")
    public void method7839(class464 arg0, boolean arg1) {
        if (!arg1) {
            this.field4882.remove(arg0);
            if (this.method7836() && !this.field4884.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4889 = System.currentTimeMillis();
        if (this.method7836()) {
            switch(this.field4885.field4878) {
                case 0:
                    arg0.field4887 = arg0.field4889;
                    break;
                case 1:
                    arg0.field4887++;
            }
            this.field4884.add(arg0);
        }
        this.field4882.add(arg0);
    }

    @ObfuscatedName("rz.ax(I)V")
    public void method7846() {
        if (this.field4886 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4886;
        while (!this.field4882.isEmpty()) {
            class464 var3 = (class464) this.field4882.peek();
            if (var3.field4889 >= var1) {
                return;
            }
            this.field4881.remove(var3.field4888);
            this.field4882.remove(var3);
            if (this.method7836()) {
                this.field4884.remove(var3);
            }
        }
    }

    @ObfuscatedName("rz.ao(S)V")
    public void method7834() {
        synchronized (this) {
            this.field4881.clear();
            this.field4882.clear();
            if (this.method7836()) {
                this.field4884.clear();
            }
        }
    }
}
