package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("x")
public class class23 {

    @ObfuscatedName("x.z")
    public int field376;

    @ObfuscatedName("x.h")
    public class78 field366;

    @ObfuscatedName("x.c")
    public DataInputStream field373;

    @ObfuscatedName("x.p")
    public byte[] field368 = new byte[4];

    @ObfuscatedName("x.i")
    public int field369;

    @ObfuscatedName("x.v")
    public byte[] field370;

    @ObfuscatedName("x.l")
    public int field367;

    @ObfuscatedName("x.m")
    public long field365;

    public class23(class73 arg0, URL arg1) {
        this.field366 = arg0.method1474(arg1);
        this.field376 = 0;
        this.field365 = class120.method228() + 30000L;
    }

    @ObfuscatedName("x.z(I)[B")
    public byte[] method220() throws IOException {
        if (class120.method228() > this.field365) {
            throw new IOException();
        }
        if (this.field376 == 0) {
            if (this.field366.field1408 == 2) {
                throw new IOException();
            }
            if (this.field366.field1408 == 1) {
                this.field373 = (DataInputStream) this.field366.field1411;
                this.field376 = 1;
            }
        }
        if (this.field376 == 1) {
            int var1 = this.field373.available();
            if (var1 > 0) {
                if (this.field369 + var1 > 4) {
                    var1 = 4 - this.field369;
                }
                this.field369 += this.field373.read(this.field368, this.field369, var1);
                if (this.field369 == 4) {
                    int var2 = (new class126(this.field368)).method2467();
                    this.field370 = new byte[var2];
                    this.field376 = 2;
                }
            }
        }
        if (this.field376 == 2) {
            int var3 = this.field373.available();
            if (var3 > 0) {
                if (this.field367 + var3 > this.field370.length) {
                    var3 = this.field370.length - this.field367;
                }
                this.field367 += this.field373.read(this.field370, this.field367, var3);
                if (this.field367 == this.field370.length) {
                    return this.field370;
                }
            }
        }
        return null;
    }
}
