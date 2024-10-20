package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ey")
public final class class147 extends class343 implements Runnable {

    @ObfuscatedName("ey.n")
    public InputStream field1570;

    @ObfuscatedName("ey.c")
    public OutputStream field1569;

    @ObfuscatedName("ey.m")
    public Socket field1579;

    @ObfuscatedName("ey.k")
    public boolean field1571 = false;

    @ObfuscatedName("ey.o")
    public class143 field1572;

    @ObfuscatedName("ey.g")
    public class149 field1573;

    @ObfuscatedName("ey.z")
    public byte[] field1574;

    @ObfuscatedName("ey.a")
    public int field1575 = 0;

    @ObfuscatedName("ey.u")
    public int field1576 = 0;

    @ObfuscatedName("ey.e")
    public boolean field1580 = false;

    @ObfuscatedName("ey.l")
    public final int field1578;

    @ObfuscatedName("ey.y")
    public final int field1568;

    public class147(Socket arg0, class143 arg1, int arg2) throws IOException {
        this.field1572 = arg1;
        this.field1579 = arg0;
        this.field1578 = arg2;
        this.field1568 = arg2 - 100;
        this.field1579.setSoTimeout(30000);
        this.field1579.setTcpNoDelay(true);
        this.field1579.setReceiveBufferSize(65536);
        this.field1579.setSendBufferSize(65536);
        this.field1570 = this.field1579.getInputStream();
        this.field1569 = this.field1579.getOutputStream();
    }

    @ObfuscatedName("ey.n(S)V")
    public void method2541() {
        if (this.field1571) {
            return;
        }
        synchronized (this) {
            this.field1571 = true;
            this.notifyAll();
        }
        if (this.field1573 != null) {
            while (this.field1573.field1591 == 0) {
                class398.method4655(1L);
            }
            if (this.field1573.field1591 == 1) {
                try {
                    ((Thread) this.field1573.field1595).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1573 = null;
    }

    public void finalize() {
        this.method2541();
    }

    @ObfuscatedName("ey.c(B)I")
    public int method2540() throws IOException {
        return this.field1571 ? 0 : this.field1570.read();
    }

    @ObfuscatedName("ey.m(I)I")
    public int method2543() throws IOException {
        return this.field1571 ? 0 : this.field1570.available();
    }

    @ObfuscatedName("ey.k(II)Z")
    public boolean method2544(int arg0) throws IOException {
        if (this.field1571) {
            return false;
        } else {
            return this.field1570.available() >= arg0;
        }
    }

    @ObfuscatedName("ey.o([BIII)I")
    public int method2545(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1571) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field1570.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("ey.g([BIII)V")
    public void method2546(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1571) {
            return;
        }
        if (this.field1580) {
            this.field1580 = false;
            throw new IOException();
        }
        if (this.field1574 == null) {
            this.field1574 = new byte[this.field1578];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1574[this.field1576] = arg0[arg1 + var5];
                this.field1576 = (this.field1576 + 1) % this.field1578;
                if ((this.field1575 + this.field1568) % this.field1578 == this.field1576) {
                    throw new IOException();
                }
            }
            if (this.field1573 == null) {
                this.field1573 = this.field1572.method2514(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1576 == this.field1575) {
                            if (this.field1571) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1575;
                        if (this.field1576 >= this.field1575) {
                            var4 = this.field1576 - this.field1575;
                        } else {
                            var4 = this.field1578 - this.field1575;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1569.write(this.field1574, var3, var4);
                    } catch (IOException var12) {
                        this.field1580 = true;
                    }
                    this.field1575 = (this.field1575 + var4) % this.field1578;
                    try {
                        if (this.field1576 == this.field1575) {
                            this.field1569.flush();
                        }
                    } catch (IOException var11) {
                        this.field1580 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1570 != null) {
                        this.field1570.close();
                    }
                    if (this.field1569 != null) {
                        this.field1569.close();
                    }
                    if (this.field1579 != null) {
                        this.field1579.close();
                    }
                } catch (IOException var10) {
                }
                this.field1574 = null;
                break;
            }
        } catch (Exception var15) {
            class424.method21((String) null, var15);
        }
    }

    @ObfuscatedName("ey.z([BIIB)V")
    public void method2567(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2546(arg0, arg1, arg2);
    }
}
