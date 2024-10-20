package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("pd")
public class class394 extends AbstractQueue {

    @ObfuscatedName("pd.aw")
    public class392[] field4456;

    @ObfuscatedName("pd.ay")
    public Map field4457;

    @ObfuscatedName("pd.ar")
    public int field4458;

    @ObfuscatedName("pd.am")
    public final Comparator field4459;

    @ObfuscatedName("pd.as")
    public int field4460;

    public class394(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class394(int arg0, Comparator arg1) {
        this.field4460 = 0;
        this.field4456 = new class392[arg0];
        this.field4457 = new HashMap();
        this.field4459 = arg1;
    }

    @ObfuscatedName("pd.aw(I)V")
    public void method6612() {
        int var1 = (this.field4456.length << 1) + 1;
        this.field4456 = (class392[]) ((class392[]) Arrays.copyOf(this.field4456, var1));
    }

    public int size() {
        return this.field4458;
    }

    public boolean offer(Object arg0) {
        if (this.field4457.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4460++;
        int var2 = this.field4458;
        if (var2 >= this.field4456.length) {
            this.method6612();
        }
        this.field4458++;
        if (var2 == 0) {
            this.field4456[0] = new class392(arg0, 0);
            this.field4457.put(arg0, this.field4456[0]);
        } else {
            this.field4456[var2] = new class392(arg0, var2);
            this.field4457.put(arg0, this.field4456[var2]);
            this.method6616(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4458 == 0 ? null : this.field4456[0].field4451;
    }

    public Object poll() {
        if (this.field4458 == 0) {
            return null;
        }
        this.field4460++;
        Object var1 = this.field4456[0].field4451;
        this.field4457.remove(var1);
        this.field4458--;
        if (this.field4458 == 0) {
            this.field4456[this.field4458] = null;
        } else {
            this.field4456[0] = this.field4456[this.field4458];
            this.field4456[0].field4449 = 0;
            this.field4456[this.field4458] = null;
            this.method6617(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class392 var2 = (class392) this.field4457.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4460++;
        this.field4458--;
        if (this.field4458 == var2.field4449) {
            this.field4456[this.field4458] = null;
            return true;
        }
        class392 var3 = this.field4456[this.field4458];
        this.field4456[this.field4458] = null;
        this.field4456[var2.field4449] = var3;
        this.field4456[var2.field4449].field4449 = var2.field4449;
        this.method6617(var2.field4449);
        if (this.field4456[var2.field4449] == var3) {
            this.method6616(var2.field4449);
        }
        return true;
    }

    @ObfuscatedName("pd.ay(IB)V")
    public void method6616(int arg0) {
        class392 var2 = this.field4456[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class392 var4 = this.field4456[var3];
            if (this.field4459 == null) {
                if (((Comparable) var2.field4451).compareTo(var4.field4451) >= 0) {
                    break;
                }
            } else if (this.field4459.compare(var2.field4451, var4.field4451) >= 0) {
                break;
            }
            this.field4456[arg0] = var4;
            this.field4456[arg0].field4449 = arg0;
            arg0 = var3;
        }
        this.field4456[arg0] = var2;
        this.field4456[arg0].field4449 = arg0;
    }

    @ObfuscatedName("pd.ar(IB)V")
    public void method6617(int arg0) {
        class392 var2 = this.field4456[arg0];
        int var3 = this.field4458 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class392 var5 = this.field4456[var4];
            int var6 = (arg0 << 1) + 2;
            class392 var7 = this.field4456[var6];
            int var8;
            if (this.field4459 == null) {
                if (var6 < this.field4458 && ((Comparable) var5.field4451).compareTo(var7.field4451) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4458 && this.field4459.compare(var5.field4451, var7.field4451) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4459 == null) {
                if (((Comparable) var2.field4451).compareTo(this.field4456[var8].field4451) <= 0) {
                    break;
                }
            } else if (this.field4459.compare(var2.field4451, this.field4456[var8].field4451) <= 0) {
                break;
            }
            this.field4456[arg0] = this.field4456[var8];
            this.field4456[arg0].field4449 = arg0;
            arg0 = var8;
        }
        this.field4456[arg0] = var2;
        this.field4456[arg0].field4449 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4457.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4459 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4459);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class393(this);
    }
}
