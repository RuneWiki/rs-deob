package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.Digest;

public class DigestInputBuffer extends ByteArrayOutputStream {

    public void updateDigest(Digest arg0) {
        arg0.update(this.buf, 0, this.count);
    }
}
