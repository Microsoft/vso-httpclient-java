// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.teamfoundation.workitemtracking.webapi.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class QueryHierarchyItem
    extends WorkItemTrackingResource {

    private ArrayList<QueryHierarchyItem> children;
    private WorkItemQueryClause clauses;
    private ArrayList<WorkItemFieldReference> columns;
    private IdentityReference createdBy;
    private Date createdDate;
    private LinkQueryMode filterOptions;
    private boolean hasChildren;
    private UUID id;
    private boolean isDeleted;
    private boolean isFolder;
    private boolean isInvalidSyntax;
    private boolean isPublic;
    private IdentityReference lastModifiedBy;
    private Date lastModifiedDate;
    private WorkItemQueryClause linkClauses;
    private String name;
    private String path;
    private QueryType queryType;
    private ArrayList<WorkItemQuerySortColumn> sortColumns;
    private WorkItemQueryClause sourceClauses;
    private WorkItemQueryClause targetClauses;
    private String wiql;

    public ArrayList<QueryHierarchyItem> getChildren() {
        return children;
    }

    public void setChildren(final ArrayList<QueryHierarchyItem> children) {
        this.children = children;
    }

    public WorkItemQueryClause getClauses() {
        return clauses;
    }

    public void setClauses(final WorkItemQueryClause clauses) {
        this.clauses = clauses;
    }

    public ArrayList<WorkItemFieldReference> getColumns() {
        return columns;
    }

    public void setColumns(final ArrayList<WorkItemFieldReference> columns) {
        this.columns = columns;
    }

    public IdentityReference getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final IdentityReference createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    public LinkQueryMode getFilterOptions() {
        return filterOptions;
    }

    public void setFilterOptions(final LinkQueryMode filterOptions) {
        this.filterOptions = filterOptions;
    }

    public boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(final boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    @JsonProperty("isDeleted")
    public boolean isDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setDeleted(final boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("isFolder")
    public boolean isFolder() {
        return isFolder;
    }

    @JsonProperty("isFolder")
    public void setFolder(final boolean isFolder) {
        this.isFolder = isFolder;
    }

    @JsonProperty("isInvalidSyntax")
    public boolean isInvalidSyntax() {
        return isInvalidSyntax;
    }

    @JsonProperty("isInvalidSyntax")
    public void setInvalidSyntax(final boolean isInvalidSyntax) {
        this.isInvalidSyntax = isInvalidSyntax;
    }

    @JsonProperty("isPublic")
    public boolean isPublic() {
        return isPublic;
    }

    @JsonProperty("isPublic")
    public void setPublic(final boolean isPublic) {
        this.isPublic = isPublic;
    }

    public IdentityReference getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(final IdentityReference lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(final Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public WorkItemQueryClause getLinkClauses() {
        return linkClauses;
    }

    public void setLinkClauses(final WorkItemQueryClause linkClauses) {
        this.linkClauses = linkClauses;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public QueryType getQueryType() {
        return queryType;
    }

    public void setQueryType(final QueryType queryType) {
        this.queryType = queryType;
    }

    public ArrayList<WorkItemQuerySortColumn> getSortColumns() {
        return sortColumns;
    }

    public void setSortColumns(final ArrayList<WorkItemQuerySortColumn> sortColumns) {
        this.sortColumns = sortColumns;
    }

    public WorkItemQueryClause getSourceClauses() {
        return sourceClauses;
    }

    public void setSourceClauses(final WorkItemQueryClause sourceClauses) {
        this.sourceClauses = sourceClauses;
    }

    public WorkItemQueryClause getTargetClauses() {
        return targetClauses;
    }

    public void setTargetClauses(final WorkItemQueryClause targetClauses) {
        this.targetClauses = targetClauses;
    }

    public String getWiql() {
        return wiql;
    }

    public void setWiql(final String wiql) {
        this.wiql = wiql;
    }
}
