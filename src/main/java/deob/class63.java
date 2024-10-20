package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bw")
public class class63 extends class50 {

    @ObfuscatedName("bw.k")
    public AudioFormat field1183;

    @ObfuscatedName("bw.b")
    public SourceDataLine field1182;

    @ObfuscatedName("bw.aw")
    public int field1181;

    @ObfuscatedName("bw.at")
    public byte[] field1184;

    @ObfuscatedName("bw.k(Ljava/awt/Component;)V")
    public void method922(Component arg0) {
        this.field1183 = new AudioFormat((float) Statics.field1075, 16, Statics.field2958 ? 2 : 1, true, false);
        this.field1184 = new byte[0x100 << (Statics.field2958 ? 2 : 1)];
    }

    @ObfuscatedName("bw.b(I)V")
    public void method923(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1183, arg0 << (Statics.field2958 ? 2 : 1));
            this.field1182 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1182.open();
            this.field1182.start();
            this.field1181 = arg0;
        } catch (LineUnavailableException var4) {
            if (class113.method2889(arg0) == 1) {
                this.field1182 = null;
                throw var4;
            } else {
                this.method923(class113.method1367(arg0));
            }
        }
    }

    @ObfuscatedName("bw.e()I")
    public int method921() {
        return this.field1181 - (this.field1182.available() >> (Statics.field2958 ? 2 : 1));
    }

    @ObfuscatedName("bw.i()V")
    public void method926() {
        int var1 = 256;
        if (Statics.field2958) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1077[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1184[var2 * 2] = (byte) (var3 >> 8);
            this.field1184[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1182.write(this.field1184, 0, var1 << 1);
    }

    @ObfuscatedName("bw.t()V")
    public void method935() {
        if (this.field1182 != null) {
            this.field1182.close();
            this.field1182 = null;
        }
    }

    @ObfuscatedName("bw.z()V")
    public void method927() {
        this.field1182.flush();
    }
}
