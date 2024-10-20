package deob;

@ObfuscatedName("lb")
public class class321 extends class328 {

    @ObfuscatedName("lb.s")
    public boolean field3843;

    @ObfuscatedName("lb.t")
    public boolean field3842;

    @ObfuscatedName("lb.s(Llb;B)I")
    public int method5173(class321 arg0) {
        if (client.field405 == this.field3865 && client.field405 != arg0.field3865) {
            return -1;
        } else if (client.field405 == arg0.field3865 && client.field405 != this.field3865) {
            return 1;
        } else if (this.field3865 != 0 && arg0.field3865 == 0) {
            return -1;
        } else if (arg0.field3865 != 0 && this.field3865 == 0) {
            return 1;
        } else if (this.field3843 && !arg0.field3843) {
            return -1;
        } else if (!this.field3843 && arg0.field3843) {
            return 1;
        } else if (this.field3842 && !arg0.field3842) {
            return -1;
        } else if (!this.field3842 && arg0.field3842) {
            return 1;
        } else if (this.field3865 == 0) {
            return arg0.field3869 - this.field3869;
        } else {
            return this.field3869 - arg0.field3869;
        }
    }

    @ObfuscatedName("lb.t(Llm;I)I")
    public int method5167(class324 arg0) {
        return this.method5173((class321) arg0);
    }

    public int compareTo(Object arg0) {
        return this.method5173((class321) arg0);
    }
}
