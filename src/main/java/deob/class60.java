package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bi")
public class class60 extends class58 {

    @ObfuscatedName("bi.aq")
    public AudioFormat field1077;

    @ObfuscatedName("bi.aw")
    public SourceDataLine field1076;

    @ObfuscatedName("bi.as")
    public int field1078;

    @ObfuscatedName("bi.ah")
    public byte[] field1075;

    @ObfuscatedName("bi.a(Ljava/awt/Component;B)V")
    public void method1037(Component arg0) {
        this.field1077 = new AudioFormat((float) Statics.field1046, 16, Statics.field1058 ? 2 : 1, true, false);
        this.field1075 = new byte[0x100 << (Statics.field1058 ? 2 : 1)];
    }

    @ObfuscatedName("bi.h(II)V")
    public void method1038(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1077, arg0 << (Statics.field1058 ? 2 : 1));
            this.field1076 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1076.open();
            this.field1076.start();
            this.field1078 = arg0;
        } catch (LineUnavailableException var4) {
            if (class165.method751(arg0) == 1) {
                this.field1076 = null;
                throw var4;
            } else {
                this.method1038(class165.method2663(arg0));
            }
        }
    }

    @ObfuscatedName("bi.p(I)I")
    public int method1032() {
        return this.field1078 - (this.field1076.available() >> (Statics.field1058 ? 2 : 1));
    }

    @ObfuscatedName("bi.t()V")
    public void method1031() {
        int var1 = 256;
        if (Statics.field1058) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1052[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1075[var2 * 2] = (byte) (var3 >> 8);
            this.field1075[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1076.write(this.field1075, 0, var1 << 1);
    }

    @ObfuscatedName("bi.f(B)V")
    public void method1040() {
        if (this.field1076 != null) {
            this.field1076.close();
            this.field1076 = null;
        }
    }

    @ObfuscatedName("bi.z(I)V")
    public void method1044() {
        this.field1076.flush();
    }
}
