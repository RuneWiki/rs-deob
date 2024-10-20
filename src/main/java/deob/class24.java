package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("e")
public class class24 {

    @ObfuscatedName("e.c")
    public int field404;

    @ObfuscatedName("e.q")
    public class79 field387;

    @ObfuscatedName("e.y")
    public DataInputStream field389;

    @ObfuscatedName("e.v")
    public byte[] field390 = new byte[4];

    @ObfuscatedName("e.g")
    public int field405;

    @ObfuscatedName("e.x")
    public byte[] field392;

    @ObfuscatedName("e.u")
    public int field391;

    @ObfuscatedName("e.l")
    public long field394;

    public class24(class74 arg0, URL arg1) {
        this.field387 = arg0.method1430(arg1);
        this.field404 = 0;
        this.field394 = class121.method2119() + 30000L;
    }

    @ObfuscatedName("e.c(I)[B")
    public byte[] method205() throws IOException {
        if (class121.method2119() > this.field394) {
            throw new IOException();
        }
        if (this.field404 == 0) {
            if (this.field387.field1423 == 2) {
                throw new IOException();
            }
            if (this.field387.field1423 == 1) {
                this.field389 = (DataInputStream) this.field387.field1427;
                this.field404 = 1;
            }
        }
        if (this.field404 == 1) {
            int var1 = this.field389.available();
            if (var1 > 0) {
                if (this.field405 + var1 > 4) {
                    var1 = 4 - this.field405;
                }
                this.field405 += this.field389.read(this.field390, this.field405, var1);
                if (this.field405 == 4) {
                    int var2 = (new class127(this.field390)).method2323();
                    this.field392 = new byte[var2];
                    this.field404 = 2;
                }
            }
        }
        if (this.field404 == 2) {
            int var3 = this.field389.available();
            if (var3 > 0) {
                if (this.field391 + var3 > this.field392.length) {
                    var3 = this.field392.length - this.field391;
                }
                this.field391 += this.field389.read(this.field392, this.field391, var3);
                if (this.field391 == this.field392.length) {
                    return this.field392;
                }
            }
        }
        return null;
    }
}
