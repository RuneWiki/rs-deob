package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gj")
public class class168 extends class505 {

    @ObfuscatedName("gj.aq")
    public boolean field1827;

    @ObfuscatedName("gj.ad")
    public boolean field1819 = true;

    @ObfuscatedName("gj.ag")
    public List field1820;

    @ObfuscatedName("gj.ak")
    public int[] field1821;

    @ObfuscatedName("gj.ap")
    public long field1822;

    @ObfuscatedName("gj.an")
    public String field1825 = null;

    @ObfuscatedName("gj.aj")
    public byte field1824;

    @ObfuscatedName("gj.av")
    public byte field1818;

    static {
        new BitSet(65536);
    }

    public class168(class547 arg0) {
        this.method3207(arg0);
    }

    @ObfuscatedName("gj.aq(B)[I")
    public int[] method3202() {
        if (this.field1821 == null) {
            String[] var1 = new String[this.field1820.size()];
            this.field1821 = new int[this.field1820.size()];
            int var2 = 0;
            while (var2 < this.field1820.size()) {
                var1[var2] = ((class150) this.field1820.get(var2)).field1702.method9348();
                this.field1821[var2] = var2++;
            }
            class542.method3324(var1, this.field1821);
        }
        return this.field1821;
    }

    @ObfuscatedName("gj.ad(Lfa;I)V")
    public void method3203(class150 arg0) {
        this.field1820.add(arg0);
        this.field1821 = null;
    }

    @ObfuscatedName("gj.ag(IB)V")
    public void method3215(int arg0) {
        this.field1820.remove(arg0);
        this.field1821 = null;
    }

    @ObfuscatedName("gj.ak(I)I")
    public int method3223() {
        return this.field1820.size();
    }

    @ObfuscatedName("gj.ap(Ljava/lang/String;I)I")
    public int method3206(String arg0) {
        if (!this.field1819) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1820.size(); var2++) {
            if (((class150) this.field1820.get(var2)).field1702.method9347().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gj.an(Lvp;I)V")
    public void method3207(class547 arg0) {
        int var2 = arg0.method8804();
        if ((var2 & 0x1) != 0) {
            this.field1827 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1819 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method8804();
        }
        this.field5082 = arg0.method8735();
        this.field1822 = arg0.method8735();
        this.field1825 = arg0.method8739();
        arg0.method8737();
        this.field1818 = arg0.method8857();
        this.field1824 = arg0.method8857();
        int var4 = arg0.method8899();
        if (var4 <= 0) {
            return;
        }
        this.field1820 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class150 var6 = new class150();
            if (this.field1827) {
                arg0.method8735();
            }
            if (this.field1819) {
                var6.field1702 = new class569(arg0.method8739());
            }
            var6.field1704 = arg0.method8857();
            var6.field1701 = arg0.method8899();
            if (var3 >= 3) {
                arg0.method8737();
            }
            this.field1820.add(var5, var6);
        }
    }
}
