package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("ap")
public class class27 {

    @ObfuscatedName("ap.k")
    public int field588;

    @ObfuscatedName("ap.y")
    public class103 field578;

    @ObfuscatedName("ap.o")
    public DataInputStream field579;

    @ObfuscatedName("ap.r")
    public byte[] field585 = new byte[4];

    @ObfuscatedName("ap.w")
    public int field581;

    @ObfuscatedName("ap.j")
    public byte[] field582;

    @ObfuscatedName("ap.q")
    public int field587;

    @ObfuscatedName("ap.d")
    public long field584;

    public class27(class104 arg0, URL arg1) {
        this.field578 = arg0.method1833(arg1);
        this.field588 = 0;
        this.field584 = class163.method225() + 30000L;
    }

    @ObfuscatedName("ap.k(I)[B")
    public byte[] method617() throws IOException {
        if (class163.method225() > this.field584) {
            throw new IOException();
        }
        if (this.field588 == 0) {
            if (this.field578.field1668 == 2) {
                throw new IOException();
            }
            if (this.field578.field1668 == 1) {
                this.field579 = (DataInputStream) this.field578.field1676;
                this.field588 = 1;
            }
        }
        if (this.field588 == 1) {
            int var1 = this.field579.available();
            if (var1 > 0) {
                if (this.field581 + var1 > 4) {
                    var1 = 4 - this.field581;
                }
                this.field581 += this.field579.read(this.field585, this.field581, var1);
                if (this.field581 == 4) {
                    int var2 = (new class161(this.field585)).method2868();
                    this.field582 = new byte[var2];
                    this.field588 = 2;
                }
            }
        }
        if (this.field588 == 2) {
            int var3 = this.field579.available();
            if (var3 > 0) {
                if (this.field587 + var3 > this.field582.length) {
                    var3 = this.field582.length - this.field587;
                }
                this.field587 += this.field579.read(this.field582, this.field587, var3);
                if (this.field587 == this.field582.length) {
                    return this.field582;
                }
            }
        }
        return null;
    }
}
