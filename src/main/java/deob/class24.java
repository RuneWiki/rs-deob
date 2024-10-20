package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("d")
public class class24 {

    @ObfuscatedName("d.j")
    public int field380;

    @ObfuscatedName("d.f")
    public class79 field368;

    @ObfuscatedName("d.o")
    public DataInputStream field370;

    @ObfuscatedName("d.h")
    public byte[] field371 = new byte[4];

    @ObfuscatedName("d.u")
    public int field373;

    @ObfuscatedName("d.a")
    public byte[] field369;

    @ObfuscatedName("d.q")
    public int field374;

    @ObfuscatedName("d.t")
    public long field375;

    public class24(class74 arg0, URL arg1) {
        this.field368 = arg0.method1490(arg1);
        this.field380 = 0;
        this.field375 = class121.method2140() + 30000L;
    }

    @ObfuscatedName("d.j(B)[B")
    public byte[] method211() throws IOException {
        if (class121.method2140() > this.field375) {
            throw new IOException();
        }
        if (this.field380 == 0) {
            if (this.field368.field1419 == 2) {
                throw new IOException();
            }
            if (this.field368.field1419 == 1) {
                this.field370 = (DataInputStream) this.field368.field1416;
                this.field380 = 1;
            }
        }
        if (this.field380 == 1) {
            int var1 = this.field370.available();
            if (var1 > 0) {
                if (this.field373 + var1 > 4) {
                    var1 = 4 - this.field373;
                }
                this.field373 += this.field370.read(this.field371, this.field373, var1);
                if (this.field373 == 4) {
                    int var2 = (new class127(this.field371)).method2508();
                    this.field369 = new byte[var2];
                    this.field380 = 2;
                }
            }
        }
        if (this.field380 == 2) {
            int var3 = this.field370.available();
            if (var3 > 0) {
                if (this.field374 + var3 > this.field369.length) {
                    var3 = this.field369.length - this.field374;
                }
                this.field374 += this.field370.read(this.field369, this.field374, var3);
                if (this.field374 == this.field369.length) {
                    return this.field369;
                }
            }
        }
        return null;
    }
}
