package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("er")
public final class class135 implements Runnable {

    @ObfuscatedName("er.t")
    public InputStream field2062;

    @ObfuscatedName("er.b")
    public OutputStream field2071;

    @ObfuscatedName("er.p")
    public Socket field2061;

    @ObfuscatedName("er.e")
    public boolean field2060 = false;

    @ObfuscatedName("er.i")
    public class128 field2063;

    @ObfuscatedName("er.o")
    public class138 field2067;

    @ObfuscatedName("er.f")
    public byte[] field2065;

    @ObfuscatedName("er.d")
    public int field2066 = 0;

    @ObfuscatedName("er.j")
    public int field2064 = 0;

    @ObfuscatedName("er.x")
    public boolean field2069 = false;

    public class135(Socket arg0, class128 arg1) throws IOException {
        this.field2063 = arg1;
        this.field2061 = arg0;
        this.field2061.setSoTimeout(30000);
        this.field2061.setTcpNoDelay(true);
        this.field2062 = this.field2061.getInputStream();
        this.field2071 = this.field2061.getOutputStream();
    }

    @ObfuscatedName("er.b(B)V")
    public void method2670() {
        if (this.field2060) {
            return;
        }
        synchronized (this) {
            this.field2060 = true;
            this.notifyAll();
        }
        if (this.field2067 != null) {
            while (this.field2067.field2106 == 0) {
                class119.method172(1L);
            }
            if (this.field2067.field2106 == 1) {
                try {
                    ((Thread) this.field2067.field2099).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2067 = null;
    }

    public void finalize() {
        this.method2670();
    }

    @ObfuscatedName("er.p(I)I")
    public int method2662() throws IOException {
        return this.field2060 ? 0 : this.field2062.read();
    }

    @ObfuscatedName("er.e(B)I")
    public int method2663() throws IOException {
        return this.field2060 ? 0 : this.field2062.available();
    }

    @ObfuscatedName("er.i([BIII)V")
    public void method2673(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2060) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2062.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("er.o([BIIB)V")
    public void method2661(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2060) {
            return;
        }
        if (this.field2069) {
            this.field2069 = false;
            throw new IOException();
        }
        if (this.field2065 == null) {
            this.field2065 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2065[this.field2064] = arg0[arg1 + var5];
                this.field2064 = (this.field2064 + 1) % 5000;
                if ((this.field2066 + 4900) % 5000 == this.field2064) {
                    throw new IOException();
                }
            }
            if (this.field2067 == null) {
                this.field2067 = this.field2063.method2551(this, 3);
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
                        if (this.field2066 == this.field2064) {
                            if (this.field2060) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2066;
                        if (this.field2064 >= this.field2066) {
                            var4 = this.field2064 - this.field2066;
                        } else {
                            var4 = 5000 - this.field2066;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2071.write(this.field2065, var3, var4);
                    } catch (IOException var12) {
                        this.field2069 = true;
                    }
                    this.field2066 = (this.field2066 + var4) % 5000;
                    try {
                        if (this.field2066 == this.field2064) {
                            this.field2071.flush();
                        }
                    } catch (IOException var11) {
                        this.field2069 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2062 != null) {
                        this.field2062.close();
                    }
                    if (this.field2071 != null) {
                        this.field2071.close();
                    }
                    if (this.field2061 != null) {
                        this.field2061.close();
                    }
                } catch (IOException var10) {
                }
                this.field2065 = null;
                break;
            }
        } catch (Exception var15) {
            class140.method2756((String) null, var15);
        }
    }
}
