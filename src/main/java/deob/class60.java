package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bo")
public class class60 extends class58 {

    @ObfuscatedName("bo.aq")
    public AudioFormat field1096;

    @ObfuscatedName("bo.at")
    public SourceDataLine field1095;

    @ObfuscatedName("bo.au")
    public int field1097;

    @ObfuscatedName("bo.am")
    public byte[] field1098;

    @ObfuscatedName("bo.b(Ljava/awt/Component;I)V")
    public void method1101(Component arg0) {
        this.field1096 = new AudioFormat((float) Statics.field1062, 16, Statics.field1071 ? 2 : 1, true, false);
        this.field1098 = new byte[0x100 << (Statics.field1071 ? 2 : 1)];
    }

    @ObfuscatedName("bo.v(II)V")
    public void method1102(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1096, arg0 << (Statics.field1071 ? 2 : 1));
            this.field1095 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1095.open();
            this.field1095.start();
            this.field1097 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1095 = null;
                throw var11;
            } else {
                this.method1102(class158.method631(arg0));
            }
        }
    }

    @ObfuscatedName("bo.f(I)I")
    public int method1118() {
        return this.field1097 - (this.field1095.available() >> (Statics.field1071 ? 2 : 1));
    }

    @ObfuscatedName("bo.z()V")
    public void method1104() {
        int var1 = 256;
        if (Statics.field1071) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1067[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1098[var2 * 2] = (byte) (var3 >> 8);
            this.field1098[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1095.write(this.field1098, 0, var1 << 1);
    }

    @ObfuscatedName("bo.t(I)V")
    public void method1105() {
        if (this.field1095 != null) {
            this.field1095.close();
            this.field1095 = null;
        }
    }

    @ObfuscatedName("bo.y(S)V")
    public void method1096() {
        this.field1095.flush();
    }
}
