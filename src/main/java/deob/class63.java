package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bs")
public class class63 extends class50 {

    @ObfuscatedName("bs.e")
    public AudioFormat field1179;

    @ObfuscatedName("bs.v")
    public SourceDataLine field1178;

    @ObfuscatedName("bs.ac")
    public int field1177;

    @ObfuscatedName("bs.ak")
    public byte[] field1180;

    @ObfuscatedName("bs.e(Ljava/awt/Component;)V")
    public void method908(Component arg0) {
        this.field1179 = new AudioFormat((float) Statics.field1077, 16, Statics.field1081 ? 2 : 1, true, false);
        this.field1180 = new byte[0x100 << (Statics.field1081 ? 2 : 1)];
    }

    @ObfuscatedName("bs.v(I)V")
    public void method909(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1179, arg0 << (Statics.field1081 ? 2 : 1));
            this.field1178 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1178.open();
            this.field1178.start();
            this.field1177 = arg0;
        } catch (LineUnavailableException var4) {
            if (class113.method2068(arg0) == 1) {
                this.field1178 = null;
                throw var4;
            } else {
                this.method909(class113.method1303(arg0));
            }
        }
    }

    @ObfuscatedName("bs.i()I")
    public int method910() {
        return this.field1177 - (this.field1178.available() >> (Statics.field1081 ? 2 : 1));
    }

    @ObfuscatedName("bs.g()V")
    public void method921() {
        int var1 = 256;
        if (Statics.field1081) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1065[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1180[var2 * 2] = (byte) (var3 >> 8);
            this.field1180[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1178.write(this.field1180, 0, var1 << 1);
    }

    @ObfuscatedName("bs.x()V")
    public void method911() {
        if (this.field1178 != null) {
            this.field1178.close();
            this.field1178 = null;
        }
    }

    @ObfuscatedName("bs.b()V")
    public void method912() {
        this.field1178.flush();
    }
}
