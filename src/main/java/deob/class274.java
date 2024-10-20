package deob;

@ObfuscatedName("jw")
public class class274 implements Comparable {

    @ObfuscatedName("jw.t")
    public class283 field3562;

    @ObfuscatedName("jw.g")
    public class283 field3563;

    @ObfuscatedName("jw.ag(I)Ljt;")
    public class283 method4683() {
        return this.field3562;
    }

    @ObfuscatedName("jw.at(I)Ljava/lang/String;")
    public String method4684() {
        return this.field3562 == null ? "" : this.field3562.method4815();
    }

    @ObfuscatedName("jw.ao(I)Ljava/lang/String;")
    public String method4682() {
        return this.field3563 == null ? "" : this.field3563.method4815();
    }

    @ObfuscatedName("jw.av(Ljt;Ljt;I)V")
    public void method4689(class283 arg0, class283 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field3562 = arg0;
        this.field3563 = arg1;
    }

    @ObfuscatedName("jw.an(Ljw;B)I")
    public int method4686(class274 arg0) {
        return this.field3562.method4818(arg0.field3562);
    }

    public int compareTo(Object arg0) {
        return this.method4686((class274) arg0);
    }
}
