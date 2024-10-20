package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("ap")
public class class27 {

    @ObfuscatedName("ap.b")
    public int field598;

    @ObfuscatedName("ap.l")
    public class103 field590;

    @ObfuscatedName("ap.i")
    public byte[] field592 = new byte[4];

    @ObfuscatedName("ap.t")
    public DataInputStream field600;

    @ObfuscatedName("ap.k")
    public int field593;

    @ObfuscatedName("ap.h")
    public byte[] field594;

    @ObfuscatedName("ap.n")
    public int field595;

    @ObfuscatedName("ap.f")
    public long field599;

    public class27(class104 arg0, URL arg1) {
        this.field590 = arg0.method1914(arg1);
        this.field598 = 0;
        this.field599 = class156.method910() + 30000L;
    }

    @ObfuscatedName("ap.b(I)[B")
    public byte[] method619() throws IOException {
        if (class156.method910() > this.field599) {
            throw new IOException();
        }
        if (this.field598 == 0) {
            if (this.field590.field1656 == 2) {
                throw new IOException();
            }
            if (this.field590.field1656 == 1) {
                this.field600 = (DataInputStream) this.field590.field1660;
                this.field598 = 1;
            }
        }
        if (this.field598 == 1) {
            int var1 = this.field600.available();
            if (var1 > 0) {
                if (this.field593 + var1 > 4) {
                    var1 = 4 - this.field593;
                }
                this.field593 += this.field600.read(this.field592, this.field593, var1);
                if (this.field593 == 4) {
                    int var2 = (new class154(this.field592)).method2683();
                    this.field594 = new byte[var2];
                    this.field598 = 2;
                }
            }
        }
        if (this.field598 == 2) {
            int var3 = this.field600.available();
            if (var3 > 0) {
                if (this.field595 + var3 > this.field594.length) {
                    var3 = this.field594.length - this.field595;
                }
                this.field595 += this.field600.read(this.field594, this.field595, var3);
                if (this.field595 == this.field594.length) {
                    return this.field594;
                }
            }
        }
        return null;
    }
}
