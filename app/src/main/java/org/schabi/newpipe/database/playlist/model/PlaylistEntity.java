package org.schabi.newpipe.database.playlist.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import static org.schabi.newpipe.database.playlist.model.PlaylistEntity.PLAYLIST_NAME;
import static org.schabi.newpipe.database.playlist.model.PlaylistEntity.PLAYLIST_TABLE;

@Entity(tableName = PLAYLIST_TABLE,
        indices = {@Index(value = {PLAYLIST_NAME})})
public class PlaylistEntity {
    public static final String PLAYLIST_TABLE = "playlists";
    public static final String PLAYLIST_ID = "uid";
    public static final String PLAYLIST_NAME = "name";
    public static final String PLAYLIST_THUMBNAIL_URL = "thumbnail_url";
    public static final String PLAYLIST_THUMBNAIL_STREAM_ID = "thumbnail_stream_id";

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = PLAYLIST_ID)
    private long uid = 0;

    @ColumnInfo(name = PLAYLIST_NAME)
    private String name;

    @ColumnInfo(name = PLAYLIST_THUMBNAIL_STREAM_ID)
    private long thumbnailStreamId;

    public PlaylistEntity(final String name, final long thumbnailStreamId) {
        this.name = name;
        this.thumbnailStreamId = thumbnailStreamId;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(final long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public long getThumbnailStreamId() {
        return thumbnailStreamId;
    }

    public void setThumbnailStreamId(final long thumbnailStreamId) {
        this.thumbnailStreamId = thumbnailStreamId;
    }
}
