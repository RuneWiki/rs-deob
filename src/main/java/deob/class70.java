package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bd")
public class class70 extends class57 {

    @ObfuscatedName("bd.i")
    public AudioFormat field1289;

    @ObfuscatedName("bd.v")
    public SourceDataLine field1292;

    @ObfuscatedName("bd.af")
    public int field1291;

    @ObfuscatedName("bd.az")
    public byte[] field1290;

    @ObfuscatedName("bd.i(Ljava/awt/Component;)V")
    public void method1118(Component arg0) {
        this.field1289 = new AudioFormat((float) Statics.field1190, 16, Statics.field1182 ? 2 : 1, true, false);
        this.field1290 = new byte[0x100 << (Statics.field1182 ? 2 : 1)];
    }

    @ObfuscatedName("bd.v(I)V")
    public void method1114(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1289, arg0 << (Statics.field1182 ? 2 : 1));
            this.field1292 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1292.open();
            this.field1292.start();
            this.field1291 = arg0;
        } catch (LineUnavailableException var4) {
            if (class126.method2135(arg0) == 1) {
                this.field1292 = null;
                throw var4;
            } else {
                this.method1114(class126.method2294(arg0));
            }
        }
    }

    @ObfuscatedName("bd.r()I")
    public int method1126() {
        return this.field1291 - (this.field1292.available() >> (Statics.field1182 ? 2 : 1));
    }

    @ObfuscatedName("bd.n()V")
    public void method1117() {
        int var1 = 256;
        if (Statics.field1182) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1184[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1290[var2 * 2] = (byte) (var3 >> 8);
            this.field1290[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1292.write(this.field1290, 0, var1 << 1);
    }

    @ObfuscatedName("bd.x()V")
    public void method1130() {
        if (this.field1292 != null) {
            this.field1292.close();
            this.field1292 = null;
        }
    }

    @ObfuscatedName("bd.q()V")
    public void method1119() {
        this.field1292.flush();
    }
}
