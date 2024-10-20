package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ee")
public final class class134 implements Runnable {

    @ObfuscatedName("ee.a")
    public InputStream field2075;

    @ObfuscatedName("ee.v")
    public OutputStream field2069;

    @ObfuscatedName("ee.i")
    public Socket field2064;

    @ObfuscatedName("ee.b")
    public boolean field2065 = false;

    @ObfuscatedName("ee.l")
    public class127 field2066;

    @ObfuscatedName("ee.m")
    public class137 field2067;

    @ObfuscatedName("ee.w")
    public byte[] field2068;

    @ObfuscatedName("ee.e")
    public int field2063 = 0;

    @ObfuscatedName("ee.n")
    public int field2062 = 0;

    @ObfuscatedName("ee.s")
    public boolean field2071 = false;

    public class134(Socket arg0, class127 arg1) throws IOException {
        this.field2066 = arg1;
        this.field2064 = arg0;
        this.field2064.setSoTimeout(30000);
        this.field2064.setTcpNoDelay(true);
        this.field2075 = this.field2064.getInputStream();
        this.field2069 = this.field2064.getOutputStream();
    }

    @ObfuscatedName("ee.v(I)V")
    public void method2593() {
        if (this.field2065) {
            return;
        }
        synchronized (this) {
            this.field2065 = true;
            this.notifyAll();
        }
        if (this.field2067 != null) {
            while (this.field2067.field2101 == 0) {
                class118.method2072(1L);
            }
            if (this.field2067.field2101 == 1) {
                try {
                    ((Thread) this.field2067.field2097).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2067 = null;
    }

    public void finalize() {
        this.method2593();
    }

    @ObfuscatedName("ee.i(I)I")
    public int method2594() throws IOException {
        return this.field2065 ? 0 : this.field2075.read();
    }

    @ObfuscatedName("ee.b(I)I")
    public int method2595() throws IOException {
        return this.field2065 ? 0 : this.field2075.available();
    }

    @ObfuscatedName("ee.l([BIII)V")
    public void method2596(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2065) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2075.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ee.m([BIIB)V")
    public void method2597(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2065) {
            return;
        }
        if (this.field2071) {
            this.field2071 = false;
            throw new IOException();
        }
        if (this.field2068 == null) {
            this.field2068 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2068[this.field2062] = arg0[arg1 + var5];
                this.field2062 = (this.field2062 + 1) % 5000;
                if ((this.field2063 + 4900) % 5000 == this.field2062) {
                    throw new IOException();
                }
            }
            if (this.field2067 == null) {
                this.field2067 = this.field2066.method2481(this, 3);
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
                        if (this.field2063 == this.field2062) {
                            if (this.field2065) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2063;
                        if (this.field2062 >= this.field2063) {
                            var4 = this.field2062 - this.field2063;
                        } else {
                            var4 = 5000 - this.field2063;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2069.write(this.field2068, var3, var4);
                    } catch (IOException var12) {
                        this.field2071 = true;
                    }
                    this.field2063 = (this.field2063 + var4) % 5000;
                    try {
                        if (this.field2063 == this.field2062) {
                            this.field2069.flush();
                        }
                    } catch (IOException var11) {
                        this.field2071 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2075 != null) {
                        this.field2075.close();
                    }
                    if (this.field2069 != null) {
                        this.field2069.close();
                    }
                    if (this.field2064 != null) {
                        this.field2064.close();
                    }
                } catch (IOException var10) {
                }
                this.field2068 = null;
                break;
            }
        } catch (Exception var15) {
            class139.method2550((String) null, var15);
        }
    }
}
